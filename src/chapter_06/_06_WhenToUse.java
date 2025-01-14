package chapter_06;

public class _06_WhenToUse {
    public static int getPower(int number) {
        // int result = number * number;
        // return result;
        // return number * number;
        return getPower(number, 2);
        // 메소드 내에서 다른 메소드를 호출 할 수 있다.
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2의 2승을 구하기
        System.out.println(getPower(2, 2)); // 2 * 2 = 4

        // 3의 3승을 구하기
        int result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result); // 3 * 3 * 3 = 27

        // 4의 2승을 구하기
        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result); // 4 * 4 = 16
    }
}
