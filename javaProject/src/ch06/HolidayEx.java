package ch06;

import java.util.Scanner;

public class HolidayEx {
	static int y;  //y는 전역변수, 멤버변수, 클래스변수(클래스 전체에서 사용할 수 있는 변수)
	
	static void input() { //입력용 메소드
		Scanner scan = new Scanner(System.in);
		System.out.println("근속년수를 입력하세요 : ");
		y = scan.nextInt(); //입력받은 값을 y에 저장 , y는 전역변수
		scan.close();
	}
	
	static int holiday (int year) {
		int day = 0; //day는 지역변수(메서드 내에서만 사용가능한 변수)
		if(year <= 5) { //근속년수 1~5년
			day=10; //10일 휴가
		}else if(year <= 10) { //근속년수 6~10년
			day=15; //15일 휴가
		}else {
			day=20;
		}
		return day;
	}
	
	public static void main(String[] args) {
		input();
		System.out.println("휴가일수 : " + holiday(y)); 
		 								//y는 int타입 전역변수로 설정되어 있음
		
	}

}
