class Data{int x;}

public class PrimitiveParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		System.out.println("main : x = "+d.x);
		
		change(d.x);
		System.out.println("¹Ù²Û ÈÄ");
		System.out.println("main : x = "+d.x);
	}
	
	static void change (int x) {
		x = 1000;
		System.out.println("change() : x="+x);
	}

}
