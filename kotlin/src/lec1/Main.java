package lec1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Java 에서 long 과 final long 의 차이
        이 변수는 가변인가 불변인가(read-only)
         */

        final List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);


        System.out.println(numbers.get(0));
    }
}
