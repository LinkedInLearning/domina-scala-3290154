@main def main() = {
  val listaID = List(15379, 15419, 15419, 15419, 15419, 15420, 46556)
  println("ID: " + listaID)

  val listaIDUnicos = listaID.distinct
  println("ID Únicos: " + listaIDUnicos)

  val conjuntoIDUnicos = listaID.toSet
  println("ID Únicos con SET: " + listaIDUnicos)
}
