@main def main() = {
  val listaID2022 = List(15379, 15419, 15420, 46556)
  val listaID2023 = List(32332, 46554, 46766, 35545, 53706, 34797)

  println(s"Lista Original 1: $listaID2022")
  println(s"Lista Original 2: $listaID2023")

  val unionLista1 = List.concat(listaID2022, listaID2023)
  println(unionLista1)

  val unionLista2 = listaID2022 ++ listaID2023
  println(unionLista2)

  val unionLista3 = listaID2022 ::: listaID2023
  println(unionLista3)
}
