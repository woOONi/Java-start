import java.util.*;

public class week2OXquiz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("���� ����� �Է��ϼ���! >>");
		String result_ox = scan.nextLine();
		char[] result_char = result_ox.toCharArray();
		
		int sum = 0;
		int count = 0;
		
		for(int i=0;i<result_char.length;i++) {
			if(result_char[i]=='O') {
				count += 1;
				sum += count;
			} else {
				count = 0;
			}
		}
		
		System.out.println("������ "+sum+"���̴�.");
	}

}
