@main def main(): Unit = {
    val tabla = "autor"
    val columnas = Seq("id", "nombre", "apellido")
    BaseDatos.ejecutarConsulta(tabla, columnas)
}