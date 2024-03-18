import java.util.Scanner;

public class RockPaperScissorsGame {

  // ** 입력조건 2가지 구분해서 개발
  // - user 숫자 0, 1, 2 중 하나 입력 하는 경우

  // ** 탈출조건
  // - 9를 입력하면 탈출

  // ** 출력 결과
  // user 가위, com 보, user 승리

  // ** 해결방법
  // - 가위 0, 바위 1, 보2 를 숫자로 매칭
  // - 연산을 통해 규칙 도출 : user - com
  // - user가 지는 경우 : -1, 2
  // - user가 이기는 경우 : -2, 1

  static String Trans(int data) {
    String rs = "";

    // 입력한 값을 문자열로 변환
    if (data == 0)
      rs = "가위";
    else if (data == 1)
      rs = "바위";
    else
      rs = "보";
    return rs;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("0, 1, 2 중 하나를 입력하시오>");
    int user = scanner.nextInt();
    // 0, 1, 2 난수 발생
    int com = (int) (Math.random() * 3);
    System.out.println(com);

    // 입력값에 따른 게임진행
    if (user - com == -1 || user - com == 2) {
      System.out.printf("user: %s / com: %s / user 패배", Trans(user), Trans(com));
    } else if (user - com == -2 || user - com == 1) {
      System.out.printf("user: %s / com: %s / user 승리", Trans(user), Trans(com));
    } else {
      System.out.printf("user: %s / com: %s / 무승부", Trans(user), Trans(com));
    }
  }
}