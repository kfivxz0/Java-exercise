import java.util.Scanner;

public class BaseballGameEx {

   public static void main(String[] args) {
      /*
       * 규칙
       * 규칙 : 1~9 사이의 중복되지 않은 랜덤한 3자리 숫자 맞추기
       * com : 135
       * user : 234 => 1Strike 2Out( 3이 숫자,자리수 모두 맞음)
       * user : 379 => 1Ball 2Out ( 3이 숫자만 맞음)
       * user : 678 => 3Out ( 맞음 없음)
       * user : 135 => 3Strike (모두 맞음, 게임 종료 )
       */

      // 랜덤 수 3개를 만들어야함.
      // 중복되지 않은 수... 같은 게 나오면 넘어가서 다시 만들기
      int com1 = (int) (Math.random() * 9 + 1);
      int com2 = 0;
      int com3 = 0;

      // 겹치지 않는 수를 만드는 목록.
      while (true) {
         com2 = (int) (Math.random() * 9 + 1);
         if (com1 != com2) {
            break;
         }
      }
      while (true) {
         com3 = (int) (Math.random() * 9 + 1);
         if (com1 != com3 && com2 != com3) {
            break;
         }
      }

      // System.out.println(com1 + " " + com2 + " " + com3);

      // 각각 받아오기
      System.out.println("숫자 3개를 공백으로 구분하여 입력하시오. (중복 없이)>");
      Scanner scanner = new Scanner(System.in);

      // 게임 구동

      int cnt = 0;

      while (true) {
         int user1 = scanner.nextInt();
         int user2 = scanner.nextInt();
         int user3 = scanner.nextInt();

         int strike = 0;
         int ball = 0;
         int out = 0;
         cnt++;
         if (com1 == user1 && com2 == user2 && com3 == user3) {
            System.out.printf("3 Strike, 게임 종료 %d회 도전%n", cnt);
            break;
         }

         // 1번 비교
         if (com1 == user1) {
            strike = strike + 1;
         } else if (com1 == user2 || com1 == user3) {
            ball = ball + 1;
         } else {
            out = out + 1;
         }

         // 2번 비교
         if (com2 == user2) {
            strike = strike + 1;
         } else if (com2 == user1 || com2 == user3) {
            ball = ball + 1;
         } else {
            out = out + 1;
         }

         // 3번 비교
         if (com3 == user3) {
            strike = strike + 1;
         } else if (com3 == user1 || com3 == user2) {
            ball = ball + 1;
         } else {
            out = out + 1;
         }

         if (strike != 0) {
            System.out.printf("%d Strike ", strike);
         }
         if (ball != 0) {
            System.out.printf("%d ball ", ball);
         }
         if (out != 0) {
            System.out.printf("%d out", out);
         }

         System.out.println();
      }

   }

}
