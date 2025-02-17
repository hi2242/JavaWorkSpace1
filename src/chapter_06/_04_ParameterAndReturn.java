package chapter_06;

public class _04_ParameterAndReturn {

    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number;
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    // 코드 자동 정렬 : Ctrl + Alt + L

    public static void main(String[] args) {
        // 전달값과 반환값이 있는 메소드
        int retVal = getPower(2);
        System.out.println(retVal); // 2 * 2 = 4

        retVal = getPower(3);
        System.out.println(retVal); // 3 * 3 = 9

        retVal = getPowerByExp(3, 3);
        System.out.println(retVal); // 3 * 3 * 3 = 27

        System.out.println(getPowerByExp(2,4)); // 2 * 2 * 2 * 2 = 16
    }
}
