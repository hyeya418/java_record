package ch06;

import java.util.Scanner;

public class Method_Gugu {

	static void gugu(int n) {
		for(int i=1; i<=9; i++) {
			System.out.println(n+ "x" + i + "=" + n*i);
		}

	} //end gugu 메소드
	
	public static void main(String[] args) { //main메소드 첫줄부터 수행
		int dan; //지역변수
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		dan = sc.nextInt();
		
		gugu(dan); //dan메서드 호출
		
		sc.close();
	}
}
