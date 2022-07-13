package ch05;
//스캐너를 통해 입력받은 숫자들 중에 최댓값 찾기
import java.util.Scanner;

public class GetMax {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //스캐너 생성
		
		int[] intArray = new int[5]; //int타입의 배열 intArray생성
		
		int max = 0;
		
		System.out.println("양수 5개를 입력하세요."); //스캐너를 통해 값을 입력받음
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = scanner.nextInt(); //배열index 0번부터 차례대로 저장
			
			if(intArray[i]> max) { //비교하여 max에 최대값을 저장
				max = intArray[i];
			}
		}//for문
		System.out.print("가장 큰 수는 "+ max + "입니다.");
		scanner.close();
	}

}
