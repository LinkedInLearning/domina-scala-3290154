@main def main() = {
  val json = ujson.read(os.read(os.pwd / "datos" / "datos.json")).arr
  print(json)

  json.foreach { colaborador =>
    val id = colaborador("id").num.toInt
    val nombre = colaborador("nombre").str
    val apellido = colaborador("apellido").str
    val email = colaborador("email").str

    println(s"ID: $id Nombre: $nombre Apellido: $apellido Email: $email")
  }
}
