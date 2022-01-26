
public class ParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main : x = "+d.x);
		
		System.out.println("�⺻�� �Ű����� �ٲ� ��");
		changePrimitive(d.x);
		System.out.println("main : x = "+d.x);
		
		System.out.println("������ �Ű����� �ٲ� ��");
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