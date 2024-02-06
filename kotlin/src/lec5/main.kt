package lec5

fun main() {

}


fun validateScoreIsNotNegative(score: Int) {

    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}


fun validateScoreIsNotNegative2(score: Int) {

    if (score !in 0..100) {
        throw IllegalArgumentException("Score의 범위는 0부터 100입니다")
    }
}

fun getPassOrFail(score: Int): String {

    return if (score >= 50) {
        "P";
    } else {
        "F";
    }
}

fun getGrade(score: Int): String {

    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else {
        "C"
    }
}

fun getGradeWithSwitch(score: Int): String {

    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        else -> "D"
    }

}

fun judgeNumber(number: Int) {

    when(number) {
        1, 0, -1 -> print("어디서 많이 본 숫자입니다.")
        else -> print("1, 0, -1이 아닙니다")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0")
        number %2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어지는 숫자는 홀수 입니다")
    }
}

