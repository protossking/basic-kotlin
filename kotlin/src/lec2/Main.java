package lec2;

public class Main {
    public static void main(String[] args) {


    }


    public boolean startsWithA1(String str) {

        if(str == null) {
            throw new IllegalArgumentException("null이 들어 왔습니다");
        }

        return str.startsWith("A");
    }

    public Boolean startsWithA2(String str) {
        if(str == null) {
            return null;
        }

        return str.startsWith("A");
    }

    public boolean startsWithA3(String str) {
        if(str == null) {
            return false;
        }

        return str.startsWith("A");
    }

    public long calculate(Long number) {
        if(number == null) {
            return 0;
        }

        return 1L;
    }


}

