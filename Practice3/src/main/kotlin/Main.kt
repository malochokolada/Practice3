import java.util.*
fun main(args: Array<String>) {
   //1
    val myAge = 18
    val isTeenager = myAge>=13 && myAge<=19

    //2
    val theirAge = 30
    val bothTeenagers =myAge >=13 && theirAge<=19 && isTeenager

    //3
    val reader = "Зулима"
    val author ="Richard Lucas"
    val authorlsReaser = reader == author

    //4
    val myAge2 = 18
    if (myAge2 >=13 && myAge2<=19)
        println ("подросток")
    else
        println("не подросток")

    //6
    val answer = if (myAge2>=13 && myAge2<=19) println ("подросток") else println("не подросток")

    //7
    var counter =0
    while (counter<10){
        println("counter = $counter")
        counter+=1
        
        
    //8
        counter = 0
        var roll : Int = 0
        do {
            roll= Random().nextInt(6)
            counter +=1
            println("После $counter бросков $roll")
        } while (roll!=0)

        //9
        var range =1..10
        for (i in range)
            println(i*i)

        //10
        for (i in range)
            println(Math.sqrt(i.toDouble()))

        //11
        var sum = 0
        for (row in 0 until 8 step 2){
            for (column in 0 until 8){
                sum += row * column
            }
        }
    }
}