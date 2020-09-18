package Kotlinsamples.function

fun hi_hello()
{
    println ("Hope everyone is doing good")
}

fun totalmarks(Eng:Int, Maths:Int, Science:Int): Int {           //Return statement function
    return Eng+ Maths + Science
}

fun totalmarks1(Eng:Int = 90, Maths:Int = 80 , Science:Int = 70): Int {
    return Eng+ Maths + Science
}

fun sum_up(vararg values:Int): Int {               //Var Argument passing
//var result = 0
//    for (v in values)
//        result += v
//      return result    //CTRL+/ to comment all
    return values.sum()
}