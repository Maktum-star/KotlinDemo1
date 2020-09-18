fun main(args:Array<String>)
{
    //var_declare()
    //ranges()
    //arrays()
    charandstring()
}

fun var_declare()
{
    var a:Int = 21 //Integer as variable mutable declarion
    val b:Int = 31 //Integer as value Immutable declaration
    val c:Long = 2131
    val d:Float = 21.8f  //Float value
    val e:Double = 231.5e4
    println("$a, $b, $c, $d, $e")

    val f:StringBuffer = StringBuffer("test")
    f.replace(0,1,"T")   //Replacing First letter of string
    println(f)

    var g:Int;
    g = 51        //Values can be changed by assigning new values to variable
    println(g)
    g = 21
    println(g)

    ////Type Inference
    //no need to mention datatype explicitly
    val h = 24   //Consider as Int auto automatically
    val i = 25.21f // Float
    println("$h,$i")
}

fun ranges()
{
    val m = 1..10  // 1 to 10 values
    for (x in m) print("$x\t")
        println()

    val n: IntRange = 1.rangeTo(10)
    for (y in n) print("$y\t")
    println()

    val p = 50 downTo 1 step 3
    for (z in p) print("$z\t")
    println()
}

fun arrays()
{
    val names: Array<String> = arrayOf("Maktum", "Pitchu" , "Meenakshi")
    println(names.toList())
    names[1] = "Akila"
    println(names.toList())

    val studentmarks = intArrayOf(55,66,70,85,46,92)
    println(studentmarks.toList())

    val samenumber = Array (10 , {2})
    println(samenumber.toList())

    val squreofindex = Array (10, {(it*it).toString()})
    println(squreofindex.toList())
}

fun charandstring()
{
    val a = "Maktum"
    println(a)
    val b = 'Y'
    if (b=='Y')
    {
        println("match")
    }
}