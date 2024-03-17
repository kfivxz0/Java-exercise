import java.util.Scanner;

public class leapyear {
    public static void main(String[]args){
//        년도를 입력 받아 윤년 판별을 하시오.
//        <조건>
//        윤년 : 2월 29일까지 있는 해
//        1. 년도가 400의 배수
//        2. 년도가 4의 배수이면서 100의 배수가 아닐때
//        3. 두 조건 중 하나의 조건이 충족되면 윤년

        Scanner scanner = new Scanner(System.in);
        int year = 400;
        boolean cond1 = year % 400 == 0;
        boolean cond2 = year % 4 == 0;
        boolean cond3 = year % 100 == 0;

       if((cond2 && !cond3) || cond1) {
                System.out.println("윤년입니다.");
       }else {
           System.out.println("윤년이 아닙니다.");
       }
    }
}
