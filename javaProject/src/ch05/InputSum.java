package ch05;

import java.util.Scanner;

public class InputSum {

	public static void main(String[] args) {
		int[] num = new int[5];
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<num.length;i++) { //0~4
			
			System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
			num[i] = scan.nextInt(); //화면을 통해 입력받은 값을 int타입으로 num[i]배열에 저장
			
			sum = sum + num[i];
//			System.out.println(sum);
		}
		
		System.out.println("합계: "+sum);
		
	}

}
