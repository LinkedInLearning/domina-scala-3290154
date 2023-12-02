def aplicarOperacion(x: Double, y: Double, operacion: (Double, Double) => Double): Double = {
  operacion(x, y)
}

@main def run(): Unit = {
  val sumar: (Double, Double) => Double = (x, y) => x + y
  val restar: (Double, Double) => Double = (x, y) => x - y
  
  var resultado = aplicarOperacion(34, 30, sumar)
  println(s"El resultado de la suma es: $resultado")

  resultado = aplicarOperacion(45, 32, restar)
  println(s"El resultado de la resta es: $resultado")
}


