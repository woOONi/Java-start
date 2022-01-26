
public class week2ExAvg {

	public static void main(String[] args) {
		int[][] array = {
                {95, 80},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        
        int sum = 0;
        double avg = 0.0;
        
        int count = 0;
        for(int i=0; i<array.length;i++) {
        	for (int j=0; j<array[i].length; j++) {
        		count += 1;
        		sum += array[i][j];
        	}
        }
        avg = sum/(float)count;
        
        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
	}
}
