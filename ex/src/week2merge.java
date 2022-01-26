import java.util.Arrays;

public class week2merge {

	public static void main(String[] args) {
		int[] list1 = {1,3,10,11};
		int[] list2 = {2,5,11};
		
		int listlength = list1.length + list2.length;
		int[] resultList = new int[listlength];
		
		//복사
		System.arraycopy(list1, 0, resultList, 0, list1.length);
		System.arraycopy(list2, 0, resultList, list1.length, list2.length);
		
		//정렬
		Arrays.sort(resultList);
		
		System.out.println(Arrays.toString(resultList));
	}

}
