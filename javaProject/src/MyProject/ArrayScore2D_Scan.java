package MyProject;

import java.util.Scanner;

public class ArrayScore2D_Scan {

	public static void main(String[] args) {
		char grade = ' ';
		String output = "번호\t국어\t영어\t수학\t총점\t평균\t등급\n"; //String은 배열형태로 저장된다!
		
		int students;  //입력받을 학생 수의 변수 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요 : ");
		students = sc.nextInt();
		
		
		int[][] score = new int[students][3]; //입력받은 학생 수 크기만큼의 행 생성, 열은 국,영,수 3과목이므로 3열 
		
		System.out.println("국 영 수 점수를 각각 입력하세요 : ");
		
		for(int i =0; i<score.length; i++) { //성적을 입력받아 각 배열에 저장
			int tot = 0 ; //반복문 안에서 초기화해야함 
			double avg = 0; //반복문 안에서 초기화해야함
			
			output += (i+1)+"\t";//번호를 output문자열에 누적
			
			System.out.print((i+1)+"번 학생의 점수 : ");

			for(int j=0; j<score[i].length; j++) {

				score[i][j] = sc.nextInt(); //score배열에 입력받은 값 저장
				tot += score[i][j]; //총점 계산식
				output += score[i][j]+"\t"; //score값을 output문자열에 누적
			} //inner for
			
			avg = tot/(double)score[i].length; //평균 계산식
			
			if (avg >= 90) {
				grade = 'A';
			}else if (avg >= 80) {
				grade = 'B';
			}else if (avg >= 70) {
				grade = 'C';
			}else if (avg >= 60) {
				grade = 'D';
			}else {
				grade = 'F';
			}
			output += String.format("%d\t%.1f\t%s\n", tot, avg, grade);//총점, 평균, 등급의 값을 out문자열에 저장

		} //outer for
		
		System.out.println(output);

		sc.close();

		
	}//main

}
