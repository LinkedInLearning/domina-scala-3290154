@main def main(): Unit = {
    val tuplaNombres = ("Carlos", "Carmen", "Valentina", "Ana", "Carlos", "Valentina")
    println(s"Tupla de nombres: $tuplaNombres")
    
    val nombresDistintos = tuplaNombres.productIterator.toSet
    println(s"Nombres distintos: $nombresDistintos")
  }