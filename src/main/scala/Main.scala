@main def Sumar(numeros: Int*): Unit = {
  var sumatoria = 0
  for numero <- numeros do sumatoria += numero
  println(s"La sumatoria total es: $sumatoria")
}