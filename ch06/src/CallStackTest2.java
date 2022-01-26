
public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main이 시작");
		firstMethod();
		System.out.println("main이 끝남");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod이 시작");
		secondMethod();
		System.out.println("firstMethod이 끝남");
		
	}
	static void secondMethod() {
		System.out.println("secondMethod()");
	}

}
