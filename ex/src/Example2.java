import java.util.*;

public class Example2 {

	public static void main(String[] args) {
		//�Ҽ�ã��
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("�Ҽ����� Ȯ���غ� ���� �Է��ϼ���.(0 �̻�)>");
		String tmp = scanner.nextLine();
		int num = Integer.parseInt(tmp);
				
		if(num == 0 || num == 1) {
			System.out.println("�Ҽ��� �ƴ�");
		} else {
			double sqrtnum = Math.sqrt(num);
			for(int i=2;i<=sqrtnum;i++) {
				if(num%i==0) {
					System.out.println("�Ҽ� �ƴ�");
					return;
				}
			}
		System.out.println(num+"�Ҽ���");
		}
	}

}
