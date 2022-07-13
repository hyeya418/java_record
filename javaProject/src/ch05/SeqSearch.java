package ch05;

import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		int s [] = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int value, index =-1; //value는 선언만한 것, index는 -1로 초기화
		Scanner scan = new Scanner(System.in); //스캐너 생성
		
		
		System.out.println("보기 : 0 10 20 30 40 50 60 70 80 90 100");
		System.out.print("위 숫자 중 탐색할 값을 입력하시오 : ");
		value = scan.nextInt(); //화면을 통해 입력받은 값을 int형태로 value에 저장
		
		for(int i = 0; i<s.length; i++) { //0~10
			if(s[i] == value) {
			//입력한 숫자와 for문을 돌며 순차적으로 배열인덱스에 있는 값과 비교해서
			//같으면 이래 문장 수행
				index = i;
			}
		} //for문
		if(index< s.length && index>=0) //true && true == true
			System.out.println(""+value+"값은 index"+index+"의 위치에 있습니다.");
		
	}

}
