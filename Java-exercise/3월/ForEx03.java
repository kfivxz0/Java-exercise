public class ForEx03 {
    public static void main(String[] args) {
        // 1+1+2+1+2+3+1+2+3+4+...+1+2+3+...+10 의 결과값을 구하시오.
        int sum = 0;
        int rs = 0;

        for (int i = 1; i < 11; i++) {
            sum += i;
            System.out.printf("%s번째: rs:%s + sum:%s\n", i, rs, sum);
            rs += sum;
        }
        System.out.println("결과: " + rs);
    }
}
