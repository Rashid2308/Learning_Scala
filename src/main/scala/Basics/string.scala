package Basics

object string extends  App {
val str:String="Hello My name is Rashid"
  println(str.charAt(2)) //returns the character at index 2
  println(str.substring(2,10))// returns a substring starting from 2 and excluding 10
  println(str.split(" ").toList)// it will return the string from wherever there is space and will convert it into a list
  println(str.replace(" ","---"))//it will replace all the space by ---
  println(str.toUpperCase())// it will covert all the small letter to upper case
  println(str.length)// it will return the length of the string
  println(str.trim)// it will clear the extra spaces at the front and at the end of the string
  println(str.reverse)// it will the reverse the string
  println(str.take(5))// it will return the first 5 combined character

  val aNumberstring="56"
  val aNumber=aNumberstring.toInt //It will convert the string into number
  println(aNumberstring + " "+ aNumber)


  //S-Interpollators
  val name: String="Rashid"
  val age: Int=23
  println(s"My name is $name and age is $age") // this is s interpollator for using the value of name and age actual value in string
  // AlSO WE CAN PERFORM SOME MORE ACTIONS IN S-INTERPOLLATOR

  println(s" $name and age is ${age+5}")

  //F-INTERPOLLATOR

  val speed=1.2f
  val name2="Rashid"
  println(f"$name%s can eat $speed%2.2f chapati per day") //it signifies that 2.2f means total 2 words . and upto 2 decimal places

}
