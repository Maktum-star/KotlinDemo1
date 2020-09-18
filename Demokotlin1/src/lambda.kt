package Kotlinsamples.lambda

fun main(args: Array<String>)
{
 val product = {x:Int,y:Int -> x*y }
    println("The product of 23*5 is ${product(23,5)}")

    val multivalue:(Int,Int) -> Int = {x,y -> x*y}
    println("The product of 5*5 is ${multivalue(5,5)}")

    val numbers = listOf(2,5,7,9)
    val greater = numbers.count{x->x>3}   // OR it can be given as {it -> 3}
    println("The numbers greater than 3 are in  $greater")

    var sum = 0
    numbers.forEach {sum += it }
    println("The sum of $numbers is $sum")
}