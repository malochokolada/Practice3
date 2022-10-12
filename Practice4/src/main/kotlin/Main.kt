fun main(args: Array<String>) {
    //1
    printFullName("Зулима","Чич")
    //2
    printFullName(firstName = "Зулима", lastName = "Чич")
println(fibonachiNumber(4))
}

//1
fun printFullName ( firstName: String, lastName: String){
    println("$firstName" + " " + "$lastName")

}

//3
fun calcuateFullName (firstName: String, lastName: String):String {
    return "$firstName,$lastName"
    val fullNameC = calcuateFullName("Зулима","Чич")
}

//4
fun calcuateFullNamePair ( firstName: String, lastName : String): Pair <String,Int>{
    println("$firstName" + " " + "$lastName")
    val fullNameC = calcuateFullName("Зулима","Чич")
    return Pair (fullNameC, fullNameC.length)

}



//6
fun fibonachiNumber (numb:Int) : Int {
    if (numb<=0){
     return 0
    }
    if (numb==1||numb==2){
    return 1
    }
   return fibonachiNumber(numb-1)+fibonachiNumber(numb-2)
}
