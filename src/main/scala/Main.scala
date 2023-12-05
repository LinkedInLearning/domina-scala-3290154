@main def inicial(): Unit = {

    val arregloOriginal = Array(1, 2, 3, 4, 5)
    var arregloCopia = arregloOriginal.clone()

    arregloCopia = arregloCopia :+ 6
    println("Arreglo Original: " + arregloOriginal.mkString(", "))
    println("Copia de arreglo con .clone(): " + arregloCopia.mkString(", "))

    var arregloCopia2 = Array(arregloOriginal: _*)
    arregloCopia2 = arregloCopia2 :+ 7

    println("Arreglo Original: " + arregloOriginal.mkString(", "))
    println("Copia de arreglo con constructor Array: " + arregloCopia2.mkString(", "))
}