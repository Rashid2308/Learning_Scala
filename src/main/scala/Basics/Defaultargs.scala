package Basics

object Defaultargs extends App {
  def greet(Name: String="Rashid", age: Int=23, num: Int=5): Unit=
    println(s"$Name $age $num")

  greet()
  greet(Name="Ramesh")
  greet(age=42,num=2)

  /**
   * IF WE ARE USING THE SAME VALUE FOR AN ARGUMENT AGAIN AND AGAIN THEN WE CAN DEFINE IT INSIDE THE ARGUMENTS
   * FURTHER IF WE WANT TO CHANGE THE VALUE FOR IT WE CAN PASS IT INSIDE THE FUCTION WHILE CALLING
   *
   * greet(23)    We cant do like this because in this compiler will get confuse that first argument is string and you are entering a wrong data type
   *
   */
}
