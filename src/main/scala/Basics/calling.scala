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

  call_by_value(System.nanoTime()) // WHEN WE CALL BY CALL BY VALUE ONLY ONE TIME VALUE IS CALCULATED
  call_by_name(System.nanoTime()) // WHEN WE CALL BY NAME VALUE AT EACH CALL IS CALCULATED

}
