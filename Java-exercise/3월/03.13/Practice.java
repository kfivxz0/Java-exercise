public class Practice {
    public static void main(String[]args) {
       int num1 = 50;
       int num2 = 20;

        boolean cond1 = num1 >= -50000 && num1 <= 50000;
        boolean cond2 = num2 >= -50000 && num2 <= 50000;
        boolean cond3 = cond1 && cond2;

        if(cond3) {
            int rs = num1 + num2;
            System.out.println(rs);
        } else {
            System.out.println("다시 입력하시오.");
        }
    }
}
