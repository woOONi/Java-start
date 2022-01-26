package example;

public class Example10 {
	public static void main(String[] args) {
		for (int i=1;i<=10;i++) {
			for (int j=1;j<=3;j++) {
				if(i==10) 
					continue;
				System.out.printf("%d*%d=%d\t", i,j,i*j);
			}
			if(i%3==2) {
				System.out.println();
			}
		}
	}
}
