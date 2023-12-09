import redis.clients.jedis.{Jedis, JedisPool, JedisPoolConfig}

object ClienteRedis {
  def conectarRedis(): Jedis = {
    val redisHost = "localhost"
    val redisPuerto = 6379
    val redisContrasena = "123Queso."

    val redis = new JedisPool(
      new JedisPoolConfig(),
      redisHost,
      redisPuerto,
      2000,
      redisContrasena
    )

    val conecionRedis = redis.getResource
    conecionRedis.auth(redisContrasena)
    conecionRedis
  }

  def escribirRedis(clave: String, valor: String): Unit = {
    val conecionRedis = conectarRedis()
    try {
      conecionRedis.set(clave, valor)
    } finally {
      conecionRedis.close()
    }
  }

  def leerRedis(clave: String): Option[String] = {
    val conecionRedis = conectarRedis()
    try {
      Option(conecionRedis.get(clave))
    } finally {
      conecionRedis.close()
    }
  }
}
