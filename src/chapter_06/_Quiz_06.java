package chapter_06;

// 실행 결과
// 이름 : 윤**
// 주민등록번호 : 990130-1******
// 전화번호 : 010-1234-****

// 힌트
// substring()
// length()

public class _Quiz_06 {
    public static String secret(String info, int start) {
        String result = info.substring(0, start); // 윤종근 -> 윤
        // for (int i = 0; i < info.length() - start; i++) {
        for (int i = start; i < info.length(); i++) {
            result += "*"; // 윤 -> 윤**
        }
        return result;
    }

    public static void main(String[] args) {
        String name = "윤종근"; // 이름
        String id = "990130-1234567"; // 주민등록번호
        String phone = "010-1234-5678";

        System.out.println("이름 : " + secret(name, 1)); // 개인정보, 비공개 시작 위치
        System.out.println("주민등록번호 : " + secret(id, 8));
        System.out.println("전화번호 : " + secret(phone, 9));

    }
}
