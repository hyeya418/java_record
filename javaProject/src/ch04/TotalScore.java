package ch04;

import java.util.Scanner;

public class TotalScore {
	public static void main(String[] args) {
		int kor;
		int eng;
		int mat;
		int tot;
		double avg;
		char grade = ' ';
		
		for(int i=1; i<=3; i++) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		mat = sc.nextInt();
		
		System.out.println();
		
		tot = kor+eng+mat;
		avg = (double)(tot/3.0);
		
		switch((int)(avg/10)) {
		case 10:
		case 9:
			grade = '수';
			break;
		case 8 :
			grade = '우';
			break;
		case 7 :
			grade = '미';
			break;
		case 6 :
			grade = '양';
			break;
		default :
			grade = '가';
		}

		

		}
		System.out.println("========================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("------------------------");
		
		
	
	}
}
