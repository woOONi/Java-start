public class Week2ExMe {

	public static void main(String[] args) {
		char[][] star = {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
		};
		
		char[][][] result = new char[3][][];
		
		//회전 시키기 전 배열 출력
		System.out.println("회전 시키기 전 배열");
		for(int i=0; i<star.length;i++) {
			for(int j=0;j<star[i].length;j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		//90도 회전
		result[0] = new char[star[0].length][star.length];		
		for(int i =0; i<star.length;i++) {
			for(int j=0; j<star[i].length;j++) {
				int x=j;
				int y=star.length-1-i;
				
				result[0][x][y]=star[i][j];
			}
		}
		
		//180도 회전
		result[1] = new char[star.length][star[0].length];
		for(int i =0; i<result[0].length;i++) {
			for(int j=0; j<result[0][i].length;j++) {
				int x=j;
				int y=result[0].length-1-i;
				
				result[1][x][y]=result[0][i][j];
			}
		}

		//270도 회전
		result[2] = new char[star[0].length][star.length];
		for(int i =0; i<result[1].length;i++) {
			for(int j=0; j<result[1][i].length;j++) {
				int x=j;
				int y=result[1].length-1-i;
				
				result[2][x][y]=result[1][i][j];
			}
		}
		
		//출력
		for(int k=0; k<result.length;k++) {
			System.out.println();
			System.out.println(90*(k+1)+"도 회전 시킨 후 배열");
			for(int i=0; i<result[k].length;i++) {
				for(int j=0;j<result[k][i].length;j++) {
					System.out.print(result[k][i][j]);
				}
				System.out.println();
			}
		}
		
	}

}
