package ch13;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("연도를 입력하세요 : ");
		int year = scan.nextInt();
		GregorianCalendar cal = new GregorianCalendar();
		if(cal.isLeapYear(year)){//윤년계산 메소드 : isLeapYear()
			//is로 시작하는 메소드의 대부분은 boolean타입이다.
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}
	}
}
