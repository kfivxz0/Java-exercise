public class ForEx04 {
    public static void main(String[] args) {
        // 규칙
        // 1에서 100까지 출력
        // 3의 배수는 Fizz 출력
        // 5의 배수는 Buzz 출력
        // 3과 5의 공배수는 FizzBuzz 출력

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
