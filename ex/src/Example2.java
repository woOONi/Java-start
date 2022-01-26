import java.util.*;

public class Example2 {

	public static void main(String[] args) {
		//소수찾기
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("소수인지 확인해볼 수를 입력하세요.(0 이상)>");
		String tmp = scanner.nextLine();
		int num = Integer.parseInt(tmp);
				
		if(num == 0 || num == 1) {
			System.out.println("소수가 아님");
		} else {
			double sqrtnum = Math.sqrt(num);
			for(int i=2;i<=sqrtnum;i++) {
				if(num%i==0) {
					System.out.println("소수 아님");
					return;
				}
			}
		System.out.println(num+"소수임");
		}
	}

}
