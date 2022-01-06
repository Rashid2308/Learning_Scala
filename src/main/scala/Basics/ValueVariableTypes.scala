package Basics

object ValueVariableTypes extends App {
  /**
   * VAL ARE IMMUTABLE ie. ONCE assigned their values cant be changed
   * To OVERCOME that we can use VAR
   *
   * COMPILER can Infer the data type ie we need not to define the DataType
   */

  val num: Int=23
  // num=10 WE CANT DO THIS BCZ VAL in SCALA IS IMMUTABLE

  var num1: Int=23
  num1=5  //HERE we can see that it is not showing any error if we are changing the value of num1

  val no=23  //HERE we can see that if we are not defining the type of Data, It is not showing error ie Compiler in SCALA is Type Infer


  //STRING
  val aString: String="Rashid Ali"
  val aString1= "PKW"
  println(aString + " " +aString1 + " " +num)

  val aBoolean: Boolean= true // BOoLEAN type in this we have to write the boolean types in small case like true/false

  val aChar: Char= 'a' //Character should be enclosed in the single quotes . There should be only one character or it will say to convert it into the symbol

  val SDouble: Double=3.2

  val aFloat: Float= 4.1f

  val aLong: Long= 234567890 // Long Int have double the bytes of normal int

  val aShort: Short=12 // Short Int have half the bytes of normal int
}
