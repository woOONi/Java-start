import java.util.*;
public class week2score {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� ������� �Է����ּ���! >>");
		String tmp = scanner.nextLine();
		int total_subject_num = Integer.parseInt(tmp);
		
		String[] subject = new String[total_subject_num];
		String[] score = new String[total_subject_num];
		double[] score_num = new double[total_subject_num];
		double total_score = 0.0; 
		
		for(int i=0;i<total_subject_num;i++) {
			System.out.printf("%d��° ������� �Է��ϼ��� >>", i+1);
			subject[i] = scanner.nextLine();
			System.out.printf("%d��° ������ �빮�ڷ� �Է��ϼ���[A+~F] >>", i+1);
			score[i] = scanner.nextLine();
			
			switch(score[i]) {
			case "A+":
				score_num[i] = 4.5;
				break;
			case "A":
				score_num[i] = 4.0;
				break;
			case "B+":
				score_num[i] = 3.5;
				break;
			case "B":
				score_num[i] = 3.0;
				break;
			case "C+":
				score_num[i] = 2.5;
				break;
			case "C":
				score_num[i] = 2.0;
				break;
			case "D+":
				score_num[i] = 1.5;
				break;
			case "D":
				score_num[i] = 1.0;
				break;
			case "F":
				score_num[i] = 0;
				break;
			default:
				break;	
			}
		}
		System.out.println();
		System.out.println("----------------------------------");
		
		for(int i=0; i<total_subject_num;i++) {
			System.out.println(subject[i]+": " + score[i]);
			total_score += score_num[i];
		}

		System.out.println("�� ���� ����� : "+ total_score/(float)total_subject_num +"���Դϴ�.");
	}

}
