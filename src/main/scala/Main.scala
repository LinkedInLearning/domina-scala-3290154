@main def main(): Unit = {
    val clave = "hola"
    val valor = "mundo"

    ClienteRedis.escribirRedis(clave, valor)

    val resultado = ClienteRedis.leerRedis(clave)
    resultado match {
      case Some(dato) => println(s"$clave -> $dato")
      case None => println(s"Clave: $clave no encontrada.")
    }
}