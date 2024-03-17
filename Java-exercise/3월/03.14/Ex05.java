public class Ex05 {
    public static void main(String[] args) {
//        출력형태
//        1  2  3  4  5
//        6  7  8  9  10
//        11 12 13 14 15
//        16 17 18 19 20
//        21 22 23 24 25

        for (int i = 1; i < 26; i++) {
            System.out.print(i + " ");
            if(i < 10){
                System.out.print(" ");
            }
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
