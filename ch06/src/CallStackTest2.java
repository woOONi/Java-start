
public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main�� ����");
		firstMethod();
		System.out.println("main�� ����");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod�� ����");
		secondMethod();
		System.out.println("firstMethod�� ����");
		
	}
	static void secondMethod() {
		System.out.println("secondMethod()");
	}

}
