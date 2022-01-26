
public class OperatorEx6 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c= (byte)(a * b); //300은 오버플로우이기 때문에 byte형으로 변환하면 데이터 손실이 발생하여서 값이 바뀜
		
		System.out.println(c);
	}
}
