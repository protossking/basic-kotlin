package lec1

fun main() {

    var number1 = 10L;
    number1 = 5L;

//    val number2 = 10L
//    number2 = 5L
    /*
    코틀린이 val 인지 var인지 표시해줘야한다
    컴파일러가 자동으로 추론해주지만 명시해줄수도 있다
     */
    var number: Long = 5L;

    var n1: Long
    n1 = 50L
    println(n1)


    val number2: Long
    number2 = 10L
    println(number2)

    // 초기값을 지정해주지 않는 경우는 컴파일 에러 --> 초기화 필요


    //val 컬렉션은 element추가할수 있다.

    // 모든 변수는 val로 만들고 꼭 필요한 경우 var로 변경한다.



    var a1 = 11L;
    var a3 = 1_000L;

    // 기본적으로 null이 들어갈 수 없게 만들어져 있다. null 이 들어갈 수 있다고 명시하려면 ?
    var b3 : Long? = 1_000L;
    b3 = null;

}
