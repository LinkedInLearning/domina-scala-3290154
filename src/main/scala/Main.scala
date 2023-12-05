@main def main(): Unit = {
    val range = 1 until 10
    val numerosPares = range.filter(_ % 2 == 0)
    println(numerosPares.mkString(", "))

    val range2 = 10 to 2 by -2
    for i <- range2 do println(i)
}