import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		System.out.print("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)(Math.random() *3)+1;
		
		System.out.printf("����� %d, ��ǻ�ʹ� %d�Դϴ�.%n", user, com );
		
		switch(user - com) {
		case 0:
			System.out.println("�����ϴ�.");
			break;
		case -2: case 1:
			System.out.println("�̰���ϴ�!");
			break;
		case -1: case 2:
			System.out.println("�����ϴ�.");
		}
	}

}
