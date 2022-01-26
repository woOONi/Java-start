
public class Static {

	static class StaticTest{
		static int classVar = 10;
		int instanceVar = 28;
	}
	
	public static void main(String[] args) {
		StaticTest staticTest1 = new StaticTest();
		StaticTest staticTest2 = new StaticTest();

		System.out.println("1 : "+ staticTest1.classVar + ", " +staticTest1.instanceVar);
		System.out.println("2 : "+ staticTest2.classVar + ", " +staticTest2.instanceVar);
		
		staticTest1.classVar = 12;
		staticTest1.instanceVar = 400;
		
		System.out.println("1 : "+ staticTest1.classVar + ", " +staticTest1.instanceVar);
		System.out.println("2 : "+ staticTest2.classVar + ", " +staticTest2.instanceVar);
		
	}

}
