package ch05;

import java.util.Scanner;

public class ArrayPoint2 {
//스캐너와 배열을 활용해서 2명의 학생의 국,영,수 점수를 각각 입력한 후 결과 출력
	
	public static void main(String[] args) {
		
		String[] name = new String[2] ;
		int[] kor = new int[name.length];
		int[] eng = new int[name.length];
		int[] mat = new int[name.length];
		
		Scanner scan = new Scanner(System.in);
			System.out.println("2명의 학생의 국,영,수 점수를 각각 입력하세요.");

			for(int i=0;i<name.length;i++) {
				System.out.print("이름을 입력하세요 : ");
				name[i] = scan.next();
				System.out.print("국어점수를 입력하세요 : ");
				kor[i] = scan.nextInt();
				System.out.print("영어점수를 입력하세요 : ");
				eng[i] = scan.nextInt();
				System.out.print("수학점수를 입력하세요 : ");
				mat[i] = scan.nextInt();
				System.out.println();
			} //for문
			
			double tot_avg = 0;
			
			for(int i=0; i<name.length; i++) {
				int tot = kor[i] + eng[i] + mat[i];
				double avg = tot/3.0;
				tot_avg = tot_avg + avg;
				
				System.out.println("이름 : " + name[i]);
				System.out.println("국어 : " + kor[i]);
				System.out.println("영어 : " + eng[i]);
				System.out.println("수학 : " + mat[i]);
				System.out.println("총점 : " + tot);
				System.out.println(String.format("평균 : %.1f", avg));
				System.out.println();
			}//for문
			
			System.out.println("=======================");
			System.out.printf("학급평균 : %.1f", tot_avg/name.length);
		
	}//main

}
