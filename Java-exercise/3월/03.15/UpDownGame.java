package iterationex;
import java.util.Scanner;

public class UpDownGame {
//	숫자 맞추기 게임 up,down
	public static void main(String[] args) {
		int com = (int)(Math.random()*100) +1;
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		
		while(true) {
			cnt++;
			System.out.println("user >");
			int user = scanner.nextInt();
			if(com == user) {
				System.out.println(cnt + "번 빙고!!!");
				break;
			}
			if(user < com) {
				System.out.println("Up");
			}else {
				System.out.println("Down");
			}
		}
		System.out.println(cnt + "번 빙고!!!");
		
	}
}
