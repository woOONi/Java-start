
public class CastingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 65.7;
		int score = (int)d;
		char c = (char)d;
		float f = (float)score;
		float f1 = (int)1.6f;
		
		System.out.println("score = " + score);
		System.out.println("d = " + d);
		System.out.println("c = " + c);
		System.out.println("f = " + f);
		System.out.println("f1 = " +f1);
	}

}
