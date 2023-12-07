class Persona(var id: Int, var nombre: String, var apellido: String) {
  def getNombre: String = nombre

  def setNombre(nuevoNombre: String): Unit = {
    nombre = nuevoNombre
  }

  def getApellido: String = apellido

  def setApellido(nuevoApellido: String): Unit = {
    apellido = nuevoApellido
  }

  def getId: Int = id

  def setId(nuevoId: Int): Unit = {
    id = nuevoId
  }

  override def toString: String =
    s"ID: $id Nombre: $nombre Apellido: $apellido"
}

@main def main() = {
}
