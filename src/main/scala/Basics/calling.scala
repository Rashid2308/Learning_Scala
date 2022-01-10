package Basics


object calling extends App{
  def call_by_value(x: Long): Unit= {
    println("CALL BY VALUE" +x)
    println(x)
  }


  def call_by_name(x: =>Long): Unit= {
    println("CALL BY NAME" +x)
    println(x)
  }

  call_by_value(System.nanoTime())
  call_by_name(System.nanoTime())

}
