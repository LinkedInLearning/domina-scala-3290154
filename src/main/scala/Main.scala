object operacion {
  def sumar(a: Int, b: Int): Int = {
    return a + b;
  }
  def apply(a: Int, b: Int): Int = {
    return a + b;
  }
}

@main def main() = {
  val ventasMensuales = List(80000.0, 55000.0, 60000.0, 75000.0)
  val valor = ventasMensuales.apply(3)
  println(valor)

  val saludo = (nombre: String) => s"Hola $nombre"
  val respuesta = saludo.apply("Ana")
  println(respuesta)

  val suma = operacion(3, 4)
  println(suma)
}
