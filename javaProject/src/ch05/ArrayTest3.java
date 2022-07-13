package ch05;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[] numbers = {10,20,30};
		for(int i =0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//for-each문으로 데이터 출력
		
		//for-each문(향상된 for문)
		//for(데이터타입 개별값 저장 변수 : 집합변수)
		//++가 내부적으로 작동되는 메카니즘
		
		
		for(int a : numbers) { //a=개별변수, numbers=집합변수
			System.out.println(a);
		}
	}

}
