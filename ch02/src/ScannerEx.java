
import java.util.*; // Scanner ����ϱ� ���� �߰�

public class ScannerEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // ScannerŬ������ ��ü�� ����
		
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.");
		String input =scanner.nextLine(); // �Է¹��� ������ input�� ����
		int num = Integer.parseInt(input);//�Է¹��� String�� Int�� ��ȯ
		
		System.out.println("�Է³��� : " + input); // string���� 
		System.out.printf("num=%d%n", num); // int�� 
	}

}
