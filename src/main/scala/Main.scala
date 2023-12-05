@main def main(): Unit = {
    
    val  listaNombre= List("Carlos", "Laura", "Luis", "Ana", "Javier", "Rosa")
    val listaEdad  = List(30, 25, 35, 28, 40)
           
    println(s"Lista de Nombres: $listaNombre")
    println(s"Lista de Edades: $listaEdad")
  
    val tuplaPersona = listaNombre.zip(listaEdad)
    println(s"Tupla de Personas: $tuplaPersona")
  }