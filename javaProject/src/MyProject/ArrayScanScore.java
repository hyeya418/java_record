package MyProject;

import java.util.Scanner;

//학생들의 성적을 입력받아서 합계와 평균을 구하는 프로그램
//(배열, 스캐너, for-each문 활용)
public class ArrayScanScore {

	public static void main(String[] args) {
		int tot =0;
		int students; //입력받을 학생 수의 변수 선언
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적처리할 학생 수를 입력하세요 : ");
		students = sc.nextInt();
		
		int[] score = new int[students]; //입력받은 학생 수 크기만큼의 배열 생성
		
		for(int i =0; i<score.length; i++) { //배열의 크기만큼 성적을 입력받아 각 배열의 주소에 저장
			System.out.print("성적을 입력하시오 : ");
			score[i] = sc.nextInt();
		}
		
//		for(int i=0; i<score.length; i++) { //배열안의 값의 합계
//			tot += score[i];
//		}
		for(int t : score) {
			tot += t;
		}

		System.out.println("총점은 " + tot+ "입니다.");
		System.out.printf("평균 성적은 %.1f입니다.", (double)tot/score.length);
	}
}
