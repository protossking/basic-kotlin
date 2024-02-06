package lec8

fun main() {

    repeat("Hello word", userNewLine = false)

    printNameAndGender("FEMALE", "Yang")

    printAll("a", "b", "c")

    val array = arrayOf("A", "B", "C")

    printAll(*array)
}


fun max(a: Int, b: Int): Int {

    return if (a > b) {
        a
    } else {
        b
    }
}

fun max2(a: Int, b: Int) = if(a > b) a else b


fun repeat(str: String, num: Int = 3, userNewLine: Boolean = true) {

    for(i in 1..num) {
        if (userNewLine) {
            println(str)
        }
        else {
            print(str)
        }
    }
}


fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}


fun printAll(vararg string: String) {
    for(str in string) {
        println(str)
    }
}
