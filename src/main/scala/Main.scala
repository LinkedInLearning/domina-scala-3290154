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

class Colaborador(
    id: Int,
    nombre: String,
    apellido: String,
    var email: String,
    var puesto: String
) extends Persona(id, nombre, apellido) {

  def getEmail: String = email

  def setEmail(nuevoEmail: String): Unit = {
    email = nuevoEmail
  }

  def getPuesto: String = puesto

  def getPuesto(nuevoPuesto: String): Unit = {
    puesto = nuevoPuesto
  }

  override def toString: String =
    s"${super.toString} Email: $email Puesto:$puesto"
}

@main def main() = {

  val nuevoColaborador = new Colaborador(
    15379,
    "Hernan",
    "Maldonado",
    "hmaldonado@kinetecoinc.com",
    "Ingeniero I"
  )
  println(nuevoColaborador.toString)

  val nuevoColaborador2 = new Colaborador(
    46556,
    "Teresa",
    "Benítez",
    "tbenitez@kinetecoinc.com",
    "Vicetresidente RRHH"
  )
  println(nuevoColaborador2.toString)
}
