
public class TvTest1 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1 channel : "+ t1.channel);
		System.out.println("t2 channel : "+ t2.channel);

		t1.channel = 4;
		System.out.println("t1 channel : "+ t1.channel);
		System.out.println("t2 channel : "+ t2.channel);
		
		t2 = t1;
		System.out.println("t1 channel : "+ t1.channel);
		System.out.println("t2 channel : "+ t2.channel);
	}
}
