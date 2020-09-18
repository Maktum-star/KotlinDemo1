fun main (args:Array<String>){
    ListandSet()
}


fun ListandSet() {
    var Alpha = listOf(2,4, "C", "A")
    val Alpha1 = setOf(1,2,3,3,5,6)
    Alpha.plus("D")
    println(Alpha.toString())
    println(Alpha.toList())
    println(Alpha.get(3))
    println(Alpha1.contains(3))
    println(Alpha1.size)
    println(Alpha1.filter { it > 2})
    println(Alpha1.toString())
    for (x in Alpha)
        println("$x")

}




