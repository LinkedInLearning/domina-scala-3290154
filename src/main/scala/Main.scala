object operacion {
  def suma(a: Int, b: Int): Int = {
    return a + b;
  }
  def resta(a: Int, b: Int): Int = {
    return a - b;
  }
}

@main def main() = {
    val a = 10
    val b = 15
    val resultado = operacion.suma(a, b)
    print(s"El resultado de la suma es: $resultado")
}