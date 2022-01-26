
public class ParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main : x = "+d.x);
		
		System.out.println("기본형 매개변수 바꾼 후");
		changePrimitive(d.x);
		System.out.println("main : x = "+d.x);
		
		System.out.println("참조형 매개변수 바꾼 후");
		changeReference(d);
		System.out.println("main : x = "+d.x);
	}
	
	static void changePrimitive (int x) {
		x = 1000;
		System.out.println("change() : x="+x);
	}

	static void changeReference (Data d) {
		d.x = 1000;
		System.out.println("change() : x="+d.x);
	}

}