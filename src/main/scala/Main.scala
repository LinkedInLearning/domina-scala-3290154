import scala.collection.immutable.ArraySeq

@main def main() = {

  val ventasMensualesArray = new Array[Double](4)
  ventasMensualesArray(0) = 80000.0
  ventasMensualesArray(1) = 55000.0
  ventasMensualesArray(2) = 60000.0
  ventasMensualesArray(3) = 75000.0
  println("Array: " + ventasMensualesArray.mkString(","))
  
  var ventasMensualesArraySeq  = ArraySeq.empty[Double]
  ventasMensualesArraySeq = ventasMensualesArraySeq :+ 80000.0
  ventasMensualesArraySeq = ventasMensualesArraySeq :+ 55000.0
  ventasMensualesArraySeq = ventasMensualesArraySeq :+ 60000.0
  ventasMensualesArraySeq = ventasMensualesArraySeq :+ 75000.0
  println("ArraySeq: "+ ventasMensualesArraySeq.mkString(","))

  println("Acceso a elementos: ")
  val primerElemento = ventasMensualesArray(0)
  println(s"Primer elemento Array $primerElemento")

  val primerElementoArraySeq = ventasMensualesArraySeq(0)
  println(s"Primer elemento ArraySeq $primerElementoArraySeq")

  println("Modificar Elementos: ")
  ventasMensualesArray(0) = 30000
  println("Modificación en Array: " + ventasMensualesArray.mkString(","))

  val nuevoArraySeq = ventasMensualesArraySeq.updated(0, 2000)
  println("Modificación en ArraySeq " + nuevoArraySeq.mkString(","))
  
}