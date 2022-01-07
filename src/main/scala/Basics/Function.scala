package Basics

object Function extends App{

  // WE NEVER USE LOOPS IN SCALA. IT HAS SIDE EFFECTS

  def aGreeting(name: String,age: Int): Unit= // We can either mention the data type or Not in the functions
    // BUT FOR RECURSIVE FUNCTION WE NEED TO DEFINE THE RETURN TYPE

    println(s"Hello My name is $name and age is $age")


  aGreeting("Rashid Ali",23)

  def aRecursive(name: String, n: Int): String=
    if(n==1) name
    else name + " " + aRecursive(name,n-1)


  println(aRecursive("Rashid",n = 3))

  def aOdd(n: Int): Boolean={
    if (n%2==0) true
    else false
  }

  println(aOdd(68))

  def aFactorial(n: Int): Int={
    if (n==0 || n==1) 1
    else n*aFactorial(n-1)
  }
  println(aFactorial(5))

  def aFibonacci(n: Int): Int= {
    if (n==0||n==1) 1
    else aFibonacci(n-1)+aFibonacci(n-2)
  }


  println(aFibonacci(5))


  /**
  aPrime(n: Int): ={
    (i<-2 to n/2)={
  (n%i ==0) true
    }
  */

  //DON'T DO LIKE This

  def aPrime(n:Int): Boolean={
    def isPrimeUntil(p: Int): Boolean=   //NESTED FUNCTION
      if (p<=1) true
      else n %p !=0 && isPrimeUntil(p-1)

    isPrimeUntil(n/2)
  }

  println(aPrime(42))



}
