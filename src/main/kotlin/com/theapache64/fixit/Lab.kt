fun main() {
    val line = "A B C D E F G H I J K L M N O"
    val words = line.split(" ")
    val numOfWords = words.size
    val numOfLines = 4
    val wordsPerLine = numOfWords / numOfLines
    println("Num of words ${numOfWords}, words per line ${wordsPerLine}")
    val x = reduce(words, wordsPerLine, numOfLines)
    println("Result : $x")
}

fun reduce(array: List<String>, splitIndex: Int, size: Int): List<String> {
    val list = mutableListOf<String>()
    /*println(splitIndex)
    for (i in 0.until(4)) {
        list.add(array.slice())
    }*/
    list.add(array.slice(0..3).joinToString(separator = " "))
    list.add(array.slice(4..7).joinToString(separator = " "))
    list.add(array.slice(8..11).joinToString(separator = " "))
    list.add(array.slice(12 until array.size).joinToString(separator = " "))
    return list
}