package chapter_02;

// 키가 115cm 이므로 탑승 불가능합니다.
// 키가 121cm 이므로 탑승 가능합니다.

public class _Quiz_02 {
    public static void main(String[] args) {
        int A = 115;
        int B = 121;

        String possible = (A >= 120) ? "가능" : "불가능";
        System.out.println("키가 " + A + "cm 이므로 탑승 " + possible + "합니다.");
        possible = (B >= 120) ? "가능" : "불가능";
        System.out.println("키가 " + B + "cm 이므로 탑승 " + possible + "합니다.");

//        int height = 115;
//        String result = (height >= 120) ? "탑승 가능합니다." : "탑승 불가능합니다.";
//        System.out.println("키가 " + height + "cm 이므로 " + result);
//        height = 121;
//        result = (height >= 120) ? "탑승 가능합니다." : "탑승 불가능합니다.";
//        System.out.println("키가 " + height + "cm 이므로 " + result);
    }
}
