
public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2=cv;
//	static int cv2 = iv; 					// 클래스 변수는 인스턴스 변수를 사용할 수 없음
	static int cv2 = new MemberCall().iv;
	
	public static void main(String[] args) {

	}

}
