package ch13;

public class Change { //값을 교환하는 예제
	public static void main(String[] args) {
		int a = 10;//콜라 컵
		int b = 20;//사이다 컵
		int tmp; //빈 컵
		
		tmp = a;
		a = b;
		b = tmp;
		
		System.out.println(a);
		System.out.println(b);
	
		
	}
}
