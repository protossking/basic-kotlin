package lec9


fun main() {
    // 주 생성자
    val person = Person("가", 100)
    println(person.name)
    person.age = 20
    println(person.age)

    val person2 = Person("나")

    val person3 = Person();
}

class Person(
    name: String = "ㅁ",
    var age: Int,
    name2: String = "A"

) {

    var name2 = name
        set(value) {
            field = value.uppercase();
        }

    val name = name
        get() = field.uppercase()

    fun getUpperCaseName(): String {
        return this.name.uppercase();
    }

    val upperCaseName: String
        get() = this.name.uppercase();

    init {
        //검증 로직
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
        }
    }

    constructor(name: String) : this(name, 1) {
        println("부 생성자1")
    }

    constructor() : this("다") {
        println("부 생성자2")
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    val isAdult: Boolean
        get() = this.age >= 20

}

