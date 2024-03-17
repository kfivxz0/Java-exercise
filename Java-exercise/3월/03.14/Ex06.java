public class Ex06 {
    public static void main(String[] args) {
//        출력형태
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5


        for(int i=1; i<6; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
