package lec3

import lec2.Person

fun main() {

    /*
    코틀린에서는 선언된 기본값을 보고 타입을 추론한다.


   자바 : 기본타입간의 변환은 암시적으로 이루어질 수 있다.
   코틀린: 기본 타입간의 변환은 명시적으로 이루어져야 한다.

   to변환타입() 을 사용해야 한다.



     */

    var number1 = 3 //int
    var number2 = 3L //long

    val n1: Int = 3
    val n2: Long = n1.toLong()


    val a1: Int? = 3
    val a2: Long = a1?.toLong() ?: 0L


    val trimIndent = """
        ㅁㄴㅇㅁ니ㅏㅇㅁ너ㅣ암너ㅣㅇㄴ머ㅣㅏ이ㅓㅏ
        ${a2}
    """.trimIndent()
    print(trimIndent)


}



fun printAgeIfPerson(obj: Any) {
    if(obj is Person) { // is 는 자바의 instanceOf
        // if(obj !is Person)
        val person = obj as Person
        println(person.name)
    }
}


/*

코틀린의 Any  자바의 object 역할(모든 객체의 최상위 타입)

모든 primitive type의 최상의 타입도 any이다

any 자체로는 null을 포함할 수 없어 null을 포함하고 싶다면,
any? 표현
any equals/ hashCode/ toString 존재

 */


/*

Unit 은 자바의 void와 동일한 역할

void와 다르게 unit은 그 자체로 타입 인자로 사용 가능하다.

함수형 프로그래밍에서 unit은 단 하나의 인스턴스만 갖는 타입을 의미. 즉 코틀린의 unit은
실제 존재하는 타입이라는 것을 표현


 */


/*
 Noting은 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할

 무조건 예외를 반환하는 함수 / 무한 루프 함수 등


 */


