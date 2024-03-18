public class ForEx08 {
    public static void main(String[] args) {
        // 출력형태
        // *
        // ***
        // *****
        // *******
        // *********

        int star = 13;
        int space = star / 2;

        for (int i = 1; i <= 9; i += 2) {
            // 공백 출력
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            // 공백 출력 갯수 감소
            space--;
            System.out.println();
        }
    }
}