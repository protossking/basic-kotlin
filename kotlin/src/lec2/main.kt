package lec2

fun main() {

    // Safe call null이 아니면 실행하고 null 이면 실행하지 않는다.
    val str: String? = "ABC"
    print(str?.length)

    // 엘비스 연산자
    val str2: String? = "ABC"
    str2?.length ?: 0 // 앞이 null 이면 뒤의 연산자를 쓴다


    val str3: String? = null
    println(str3?.length ?: 0)



    startsWith("ABC")


    val person = Person("공부하는 개발자")

    startsWithA(person.name);

}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}

/*
 코틀린에서는 널이 가능한 타입을 완전히 다르게 취급한다
 */


fun startWithA1(str: String?): Boolean {

    if(str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.");
    }

    return str.startsWith("A");
}


fun startsWithA2(str: String?): Boolean? {
    if(str == null) {
        return null;
    }

    return str.startsWith("A");
}


fun startsWithA3(str: String?): Boolean {

    if(str == null) {
        return false;
    }
    return str.startsWith("A");
}




fun s2A1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null");
}


fun s2A2(str: String?): Boolean? {
    return str?.startsWith("A")
}


fun s2A3(str: String?): Boolean {

    return str?.startsWith("A") ?: false
}


fun calculate(number: Long?): Long {
    return  number ?: 0L
}


// nullable type 이지만, 아무리 생각해도 null이 될 수 없는 경우 !!
// 혹시나 null이 들어오면 Npe 발생

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}












