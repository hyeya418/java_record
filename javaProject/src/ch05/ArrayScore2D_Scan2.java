package ch05;

import java.util.Scanner;

public class ArrayScore2D_Scan2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요 : ");
		int m = scan.nextInt(); //행의 개수
		int n = 3; //열의 개수
		
		int[][]score = new int[m][n];
		System.out.println("국 영 수 점수를 각각 입력하세요 : ");
		
		for(int i=0; i<m; i++) {
			System.out.print((i+1)+"번 학생의 점수 : ");
			for(int j=0; j<n; j++) {
				score[i][j] = scan.nextInt();
			} //inner for
		}//outer for
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		
		//계산
		for(int i=0; i<score.length; i++) {
			int sum = 0; //총점
			float avg = 0.0f; //평균
			char grade = ' ';
			
			System.out.printf("%d\t",i+1); //번호 출력
			
			for(int j=0; j<score[i].length; j++) { //국,영,수 배열값 출력
				sum += score[i][j]; //총점
				System.out.printf("%d\t", score[i][j]);
		}//inner for
			
			avg = sum/(float)score[i].length; //평균 계산
			
			switch((int)(avg/10)) { //float를 int로 형변환
			case 10:
			case 9:
				grade ='A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default :
				grade = 'F';
			}
			//총점, 평균 등급 출력
			System.out.printf("%d\t %.1f\t %s%n", sum, avg, grade);
	}//outer for
			scan.close();
	}//main
}
