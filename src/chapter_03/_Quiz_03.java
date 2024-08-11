package chapter_03;

// "901231-123456"인 경우 901231-1까지 출력
// "030708-4567890"인 경우 030708-4까지 출력

public class _Quiz_03 {
    public static void main(String[] args) {
        String dayOfBirth = "990308-1234567"; // 주민등록번호 13자리

        System.out.println(dayOfBirth.substring(0, 8)); // 0 위치부터 8 위치 직전까지
        System.out.println(dayOfBirth.substring(0, dayOfBirth.indexOf("-") + 2)); // 0 위치부터 하이픈 위치 + 2 직전까지
    }
}
