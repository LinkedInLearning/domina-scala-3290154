def aplicarImpuesto = (venta: Double) => venta * 0.13

@main def main(): Unit = {
  val ventasMensuales = List(50000.0, 55000.0, 60000.0, 75000.0, 100000.0, 200000.0, 80000.0, 60000.0, 55000.0, 70000.0, 95000.0, 120000.0)
  val impuestos = ventasMensuales.map(venta => aplicarImpuesto(venta)) 

  println(s"El impuesto mensual de las ventas: $impuestos")
}
