
public class CastingEx2 {

	public static void main(String[] args) {
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i = %d -> b = %d%n", i,b);
		System.out.println("i="+Integer.toBinaryString(i));
		
		i = 300;
		b = (byte)i;
		System.out.printf("[int -> byte] i = %d -> b = %d%n", i,b);
		System.out.println("i="+Integer.toBinaryString(i));
		
		b = 10;
		i = (int)b;
		System.out.printf("[byte -> int] b = %d -> i = %d%n", i,b);
		System.out.println("i="+Integer.toBinaryString(i));
		
		b = -2;
		i = (int)b;
		System.out.printf("[byte -> int] b = %d -> i = %d%n", i,b);
		
		System.out.println("i="+Integer.toBinaryString(i));
	}

}
