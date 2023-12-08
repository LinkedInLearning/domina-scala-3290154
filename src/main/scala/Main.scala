@main def main() = {
  val buffer = io.Source.fromFile("./datos/datos.csv")

  for linea <- buffer.getLines.drop(1) do 
    val Array(id, nombre, apellido, email) = linea.split(",").map(_.trim)
    println(s"ID: $id Nombre: $nombre Apellido: $apellido Email: $email")
}
