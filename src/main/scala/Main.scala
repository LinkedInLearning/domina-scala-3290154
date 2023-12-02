def eliminarElemento(ventasMensuales: List[Double], valorAtipico: Double): List[Double] = {
  ventasMensuales.filter(_ <= valorAtipico)
}

@main def run(): Unit = {
  val ventasMensuales = List(50000.0, 55000.0, 60000.0, 75000.0, 100000.0, 200000.0, 80000.0, 60000.0, 55000.0, 70000.0, 95000.0, 120000.0)
  val valorAtipico = 130000.0

  val ventasFiltradas = eliminarElemento(ventasMensuales, valorAtipico)

  println(s"Las ventas mensuales sin valores atípicos: $ventasFiltradas")
}
