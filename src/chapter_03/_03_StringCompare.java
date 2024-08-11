package chapter_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java")); // true
        System.out.println(s2.equals("python")); // false

        // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase(("python")));

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234"; // s2는 이미 있는 같은 값인 s1이 저장된 메모리를 참조하게 된다.
        System.out.println(s1.equals(s2)); // true (내용 비교)
        System.out.println(s1 == s2); // true (참조 비교)

        s1 = new String("1234"); // 벽에 붙은 메모지가 아닌 개별 메모지
        s2 = new String("1234"); // 벽에 붙은 메모지가 아닌 개별 메모지
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false

        // 자바에서 문자열을 비교할 때는 ==를 통해 참조가 아닌
        // equals를 통해 내용을 비교해주어야 한다.
    }
}
