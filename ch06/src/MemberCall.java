
public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2=cv;
//	static int cv2 = iv; 					// Ŭ���� ������ �ν��Ͻ� ������ ����� �� ����
	static int cv2 = new MemberCall().iv;
	
	public static void main(String[] args) {

	}

}
