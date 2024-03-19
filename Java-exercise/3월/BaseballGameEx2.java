import java.util.Arrays;
import java.util.Scanner;

public class BaseballGameEx2 {

  static boolean sameCheck(int[] arr) {
    boolean rs = false; // 중복값이 없다
    if (((arr[0] == arr[1]) || (arr[0] == arr[2]) || (arr[1] == arr[2]))) {
      rs = true;
    }
    return rs;
  }

  public static void main(String[] args) {
    // 1부터 9사이의 Rondom한 3개의 숫자 맞추기
    Scanner scanner = new Scanner(System.in);
    int count = 0;
    int[] com = new int[3];
    while (true) {
      com[0] = (int) (Math.random() * 9) + 1;
      com[1] = (int) (Math.random() * 9) + 1;
      com[2] = (int) (Math.random() * 9) + 1;
      if (!sameCheck(com)) {
        break;
      }
    }

    System.out.println(Arrays.toString(com));

    while (true) {
      count++;
      int strike = 0, ball = 0, out = 0;
      System.out.println("중복되지 않는 3자리 수(1~9)>");
      String input = scanner.next();
      String s1 = input.charAt(0) + "";
      String s2 = input.charAt(1) + "";
      String s3 = input.charAt(2) + "";

      int[] user = new int[3];
      user[0] = Integer.parseInt(s1);
      user[1] = Integer.parseInt(s2);
      user[2] = Integer.parseInt(s3);

      if (sameCheck(user))
        continue;

      for (int i = 0; i < com.length; i++) {
        for (int j = 0; j < user.length; j++) {
          if (com[i] == user[j]) { // i = 0 5, j = 0 5
            if (i == j)
              strike++;
            else
              ball++;
          }
        }
      }

      out = 3 - (strike + ball);
      System.out.printf("%sS %sB %sO", strike, ball, out);
      if (strike == 3) {
        break;
      }
    } // end while
    System.out.println(count + "번 빙고!!!");
    scanner.close();
  }
}
