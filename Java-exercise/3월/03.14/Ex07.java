public class Ex07 {
    public static void main(String[] args) {
//        출력형태
//        *
//        **
//        ***
//        ****
//        *****

        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
