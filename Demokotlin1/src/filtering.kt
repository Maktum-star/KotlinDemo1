package KotlinSamples.Filtering

fun main(args: Array<String>) {
    var seq = generateSequence(1, { it + 1 })
    var numbers = seq.take(10).toList()
    println(numbers)

    var evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers)

    var notDivBy3 = numbers.filterNot { it % 3 == 0 }
    println(notDivBy3)

    // combine projection and filtering
    var oddSquares = numbers.map { it * it }.filterNot { it % 2 == 0 }
    println(oddSquares)

    var values = arrayOf<Any>(1, 2.5, 3, 4.56)
    var wholeNumbers = values.filter { it is Int } // Double, Float
    println(wholeNumbers)

    // special filter for collections of nullables
    var moreValues = arrayOf<Int?>(1, 2, 3, null, 4, 5)
    var notNullValues = values.filterNotNull()
    println(notNullValues)
}