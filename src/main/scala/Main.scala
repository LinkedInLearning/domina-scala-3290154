@main def main() = {
  val datosPersonal = Map(
    15379 -> "hmaldonado@kinetecoinc.com",
    15419 -> "czambrano@kinetecoinc.com",
    15420 -> "edomínguez@kinetecoinc.com",
    46556 -> "tbenítez@kinetecoinc.com",
    46555 -> "sblanco@kinetecoinc.com",
    46559 -> "egarcía@kinetecoinc.com",
    15428 -> "rtorres@kinetecoinc.com",
    15429 -> "rmolina@kinetecoinc.com",
    47130 -> "nflores@kinetecoinc.com",
    32117 -> "pbermúdez@kinetecoinc.com",
    32313 -> "cortiz@kinetecoinc.com"
  )

  println(datosPersonal)

  println("Primera opción...")
  for (elemento <- datosPersonal)
    println(s"Clave:${elemento._1} ->  Valor:${elemento._2}")

  println("Segunda opción...")
  for ((clave, valor) <- datosPersonal)
    println(s"Clave: $clave ->  Valor: $valor")

  println("Tercera opción...")
  datosPersonal.foreach(elemento =>
    println(s"Clave: ${elemento._1} -> Valor: ${elemento._2}")
  )

  println("Cuarta opción...")
  datosPersonal.foreach { case (clave, valor) =>
    println(s"Clave: $clave ->  Valor: $valor")
  }
}
