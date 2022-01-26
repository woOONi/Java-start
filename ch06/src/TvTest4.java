
public class TvTest4 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		
		for(int i=0; i<tvArr.length;i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;
		}
		
		for(int i=0;i<tvArr.length;i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d]의 채널번호는 %d이다.\n",i,tvArr[i].channel);
		}
		
	}

}
