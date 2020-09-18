package Kotlinsamples.hello
import Kotlinsamples.function.*

fun main (args:Array<String>)
{
    hi_hello()
    println("Total marks obtained by student is ${totalmarks(20,20,30)}")
    println("Total marks obtained by student is ${totalmarks1(50)}")  //We can pass one value alone
    println(sum_up(1,2,3,4))
}