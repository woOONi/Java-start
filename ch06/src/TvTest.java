class Tv{
	//Tv�� �Ӽ�(�������)
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel;}
	void channelDown() {--channel;}
}

public class TvTest {
	public static void main(String[] args) {
		Tv t = new Tv();
		
		t.channel = 8;
		t.channelDown();
		System.out.println(t.channel);
	}

}
