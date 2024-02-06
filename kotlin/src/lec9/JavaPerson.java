package lec9;

public class JavaPerson {

    private final String name;
    private int age;

    public JavaPerson(String name, int age) {
        if(age <= 0) {
            throw new IllegalArgumentException(String.format("나이는 %s는 1이상 이어야 합니다", age));
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public JavaPerson(String name) {
        this(name, 1);
    }
}
