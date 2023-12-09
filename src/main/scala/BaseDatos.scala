import java.sql.{Connection, DriverManager}

object BaseDatos {
  def conectarBaseDeDatos[T](block: Connection => T): Option[T] = {
    val puerto = 3308
    val baseDatosNombre = "libreria"
    val usuario = "root"
    val constrasena = "123Queso."
    val url = s"jdbc:mysql://localhost:$puerto/$baseDatosNombre"

    val conexion = DriverManager.getConnection(url, usuario, constrasena)

    try {
      Some(block(conexion))
    } catch {
      case error: Exception =>
        println(error.getMessage)
        None
    } finally {
      conexion.close()
    }
  }

  def ejecutarConsulta(
      tabla: String,
      columnas: Seq[String]
  ): Unit = {
    val listaColumnas = columnas.mkString(", ")
    val consulta = s"SELECT $listaColumnas FROM $tabla"

    conectarBaseDeDatos { conexion =>
      try {
        val resultados = conexion.createStatement.executeQuery(consulta)
        while (resultados.next()) {
          columnas.foreach(columna =>
            print(f"${resultados.getString(columna)}%-20s")
          )
          println()
        }
      } catch {
        case error: Exception =>
          println(error.getMessage)
          None
      }
    }
  }
}
