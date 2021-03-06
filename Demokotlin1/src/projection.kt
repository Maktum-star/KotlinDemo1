package KotlinSamples.Projection

fun main(args: Array<String>) {
    // lib/kotlin-runtime/kotlin/collections


    // explain about sequence generators
    var seq = generateSequence(1, {it+1})
    var numbers = seq.take(4)

    // square each number and print them

    val squares: Sequence<Int> = numbers.map { it * it }
    println(squares.toList())

    var sentence = "This is a nice sentence"; // split gives a List
    var wordLengths = sentence.split(' ').map{it.length}.asSequence()
    println(wordLengths.toList())

    // keep both word and its length
    var wordsWithLength = sentence.split(' ').map{object {
        val length = it.length
        var word = it
    }}
    for (wl in wordsWithLength)
    {
        System.out.println("'${wl.word}' has length ${wl.length}")
    }

    // split sentence into an associative array
    val wordLengthPairs = sentence.split(' ').associate{it.to(it.length)}
    println("Words and their lengths:")
    for (wl in wordLengthPairs)
        println(wl)

    var sequences = listOf("red,green,blue", "orange", "white,pink")
    var allWords = sequences.flatMap { it.split(',') } // also flatMapTo
    println(allWords.toList())

    // cartesian product
    val objects = arrayOf("house", "car", "bicycle")
    val colors = arrayOf("red", "green", "gray")

    var pairs = objects.flatMap { o -> colors.map { c -> "$c $o" } }
    println(pairs.toList())
} 