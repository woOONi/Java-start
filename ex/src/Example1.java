import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25}
				};
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("원하는 숫자를 입력하세요.>");
			
			String tmp = scanner.nextLine();
			int wantnum = Integer.parseInt(tmp);
			
			boolean check = checkarr(arr, wantnum);
			
			if (check == true) {
				printarr(arr,wantnum);
				break;
			} else {
				System.out.println("원하는 숫자가 배열 안에 없습니다.");
			}
		}
	}
	
	static boolean checkarr(int arr[][], int num) {
		boolean check = false;
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==num) {
					check = true;
				}
			}
		}
		return check;
	}
	
	public static void printarr(int arr[][], int num) {
		all: for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
				if (arr[i][j] == num) {
					break all;
				}
			}
			System.out.println();
		}
	}
}