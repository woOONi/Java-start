package example;

public class Example9 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		for (int i = 0; i<8;i++) {
			num3 = num1 + num2;
			System.out.println((i+3)+"��° �� ; "+ num3);
			
			num1 = num2;
			num2 = num3;
		}
		
		
	}

}
