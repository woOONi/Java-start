
public class ExampleTest {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(toBinaryString(1+x));
		System.out.println(toBinaryString(1 + x << 2));
	}
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}

}
