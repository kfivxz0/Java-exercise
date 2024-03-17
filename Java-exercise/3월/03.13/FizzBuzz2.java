import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args) {
//         2개의 정수를 입력 받아서 각각의 수가 짝수면 합을 구하고 한 개라도 홀수면 곱을 출력하시오.
        int i1 = 9;
        int i2 = 2;
        boolean cond1 = i1 % 2 == 0;
        boolean cond2 = i2 % 2 == 0;

        if (cond1 && cond2) {
            System.out.println(i1 + i2);
        } else {
            System.out.println(i1 * i2);
        }
    }
}
