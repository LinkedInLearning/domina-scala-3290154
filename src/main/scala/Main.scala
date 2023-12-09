class Persona(var nombre: String) {
  def getNombre: String = nombre

  def setNombre(nuevoNombre: String): Unit = {
    nombre = nuevoNombre
  }

  override def toString: String =
    s"Nombre: $nombre"
}

object Operacion {
  def suma(a: Int, b: Int): Int = {
    return a + b;
  }
}

@main def main() = {
  val persona = new Persona("Hernan")
  println(s"La persona ${persona.toString}")

  val suma = Operacion.suma(10, 15)
  println(s"El resultado de la suma es: $suma")

  val persona2 = new Persona("Rosa")
  println(s"La persona ${persona2.toString}")

   val suma2 = Operacion.suma(34, 15)
  println(s"El resultado de la suma es: $suma2")
}
