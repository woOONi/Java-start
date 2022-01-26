package example;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i=0;
		int tmp;
		
		while (sum<100) {
			i++;
			if (i%2 == 0) {
				tmp = -i;
			} else {
				tmp = i;
			}
			sum += tmp;
			System.out.printf("i : %d / sum : %d%n", i,sum);
		}
		
		System.out.println(i);
		
	}

}
