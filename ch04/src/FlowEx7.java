import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)(Math.random() *3)+1;
		
		System.out.printf("당신은 %d, 컴퓨터는 %d입니다.%n", user, com );
		
		switch(user - com) {
		case 0:
			System.out.println("비겼습니다.");
			break;
		case -2: case 1:
			System.out.println("이겼습니다!");
			break;
		case -1: case 2:
			System.out.println("졌습니다.");
		}
	}

}
