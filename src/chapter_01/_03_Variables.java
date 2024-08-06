package chapter_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "윤종근";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "이호섭";

        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        // 한 자리의 문자를 입력할 때는 char형의 변수를 선언하고 작은 따옴표로 입력한다.

        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        // 정밀한 실수를 표현할 때는 double 그 외엔 float을 이용한다.
        // float의 경우는 끝에 f나 F를 표기하여 구분한다.

        long l = 1000000000000L;
        System.out.println(l);
        l = 1_000_000_000_000L;
        System.out.println(l);

        // int에 담기지 않는 경우는 long을 이용한다.
        // long은 끝에 l이나 L을 표기하여 구분한다.
        // 큰 숫자는 가독성을 위해 _를 이용하여 표기한다.
    }
}
