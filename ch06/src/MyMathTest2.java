
class MyMath2{
	long a,b;
	
	long add() 		{return a+b;}
	long subtract()	{return a-b;}
	long multiply()	{return a*b;}
	double divide() {return a/b;}
	
	static long add(long a, long b)		{return a+b;}
	static long subtract(long a, long b)	{return a-b;}
	static long multiply(long a, long b)	{return a*b;}
	static double divide(long a, long b) {return a/b;}

}
public class MyMathTest2 {
	public static void main(String[] args) {
		//클래스메서드 호출. 인스턴스 생성없의 호출 가능
		System.out.println(MyMath2.add(200L,100L));
		System.out.println(MyMath2.subtract(200L,100L));
		System.out.println(MyMath2.multiply(200L,100L));
		System.out.println(MyMath2.divide(200L,100L));
		
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		
		//인스턴스메서드는 객체생성후에만 호출이 가능
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());

	}

}
