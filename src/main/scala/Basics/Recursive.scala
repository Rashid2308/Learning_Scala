package Basics

import scala.annotation.tailrec

object Recursive extends App{


  // WE TAIL RECURSION TO AVOID STACKOVERFLOW
  //BCZ IN TAIL RECURSION DO NOT USE NEW STACK FOR EVERY CALCULATION IN THE BLOCK
  //IT JUST STORES THE VALUE OF LAST EXPRESSION IN THE CURRENT STACK
  //TRY TO USE TAIL RECURSION...
  def aFactorial(n: BigInt):BigInt = {
    @tailrec
    def fact_Helper(x: BigInt,acc: BigInt): BigInt=
      if (x<=1) acc
      else fact_Helper(x-1,x*acc)
    fact_Helper(n,1)
  }

  println(aFactorial(20000))

  //FIBONACCI NORMAL RECURSION
  def aFibonacci(n: Int): Int=
    if (n<=1) 1
    else aFibonacci(n-1)+aFibonacci(n-2)

  println(aFibonacci(5))

  // FIBONACCI TAIL RECURSION
   def aFib(n: Int): Int= {
     @tailrec
     def aFib_Helper(x: Int,acc:Int): Int=
       if (x<=1) 1
       else aFib_Helper(x-1,(x-1)+(x-2))

     aFib_Helper(n,1)
   }
  println(aFib(5))

  // Prime Number

  def aPrime(n: Int):Boolean= {
    @tailrec
    def aPrime_Helper(x:Int): Boolean=
      if (x<=1) true
      else n%x!=0 && aPrime_Helper(x-1)

    aPrime_Helper(n/2)
  }

  println(aPrime(23))


}
