package ch04;

import java.util.Scanner;

public class While_Gugu {
//while문과 스캐너를 활용해서 구구단 출력 프로그램을 만들어 보세요.
	
	public static void main(String[] args) {
		
		int i = 1;

		Scanner dan = new Scanner(System.in);
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하세요 : ");
		int num = dan.nextInt();
			
		while (i<=9 && num<=9) {
			System.out.println(num+" x "+i+" = "+num*i);
			i++;
		}
		if(num>9) {
			System.out.println("1~9 사이의 수를 입력하세요");
		}
		
	}

}
