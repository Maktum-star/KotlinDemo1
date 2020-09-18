fun main(args:Array<String>)
{
    //Nullability()
    //if_statement()
    //smartcast()
    //for_loop()
    //when_expression()
}
fun Nullability()
{
    val x:String? = null
//    val len = x?.length
//    println(len)
    println("${x?.length}")
    val m:String? = "Maktum"
    val leng = m?.length
    println(leng)


}

fun if_statement()
{
    val time = 12
    val wish:String
    if (time < 12 )
        wish = "Good Morning"
    else if (time > 12)
        wish = "Good afternoon"
    else
        wish = "Not in a mood to wish"
    //println("Hi Team $wish")
    println("Hi Everyone ${if (time < 12) "How are you?" else "Goto Hell" }")
}

fun smartcast()    //Flow based typing
{
    val s:String? = "Hello"
    //println(s.length)
    if (s != null)      //nullable is accepted to print
        println(s.length)
}

fun for_loop()
{
   for (x in (10 downTo 1) ) print("$x\t")
    println()

    val interests = mapOf("Maktum" to "Pysics", "Pitchu" to "Chemistry" , "Akila" to "Maths")
    for ((names,interest) in interests)
    {
       println("$names is interested to learn $interest")
    }

    val ages = intArrayOf(22,23,24,26)
    for ((index, value) in ages.withIndex())
    {
        println("$index:\t$value")
    }

}

fun when_expression()
{
    val areacode = 102
    when(areacode){
        66 -> println("Whitefield")
        18 -> println("Chamarajpet")
        1, 5 -> println("Cental region")
        in 80..100 -> println("Unknown area code")
        else -> {
            println ("Invalid Area code")
        }

    }
}