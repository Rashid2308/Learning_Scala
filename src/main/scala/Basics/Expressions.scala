package Basics

object Expressions extends App {

  /**
   * EXPRESSIONS VS INSTRUCTIONS
   * INSTRUCTIONS are executed
   * expressions are evaluated
   * In SCALA we have to think in terms of Expressions
   * Everything in Scala is Expression
   */
  val a=2+3
  println(a) // Here 2+3 is an expression . In SCALA everything is an Expression

  //Also
  val b=2.+(3)
  println(b)

  println(5+3) //println return a unit value. It is a side effect.

  val x=10
  val xIsEven= x%2==0  //It will return a boolean value
   println(xIsEven)

  val xIsOdd= x%2!=0
  println(xIsOdd)

  val cond: Boolean= x>a
  //println(cond)

  // for if we will do in this way

  val i=if(cond) "YES" else "NO"
  println(i)

  //NEVER EVER USE LOOPS IN SCALA. IT HAS A VERY BAD IMPRESSION
  // SCALA CONSIDERS LOOPS AS SIDE EFFECTS

  //CODE BLOCKS
  // LAST STATEMENT WILL BE CONSIDERED AS THE FINAL VALUE OF CODE BLOCK


  val p={
    var k = 5 + 9
    k -=1
    var z=23
    z+=12
    79
  }

  // z=12.... THE SCOPE OF THE VARIABLE DECLARED INSIDE A BLOCK HAS INSIDE THE BLOCK ONLY

  println(p)// LAST VALUE THAT IS 79 WILL PRINT OF THE CODE BLOCK


}
