package ch06;

//반환값이 있는 메소드 , 반환타입이 일치해야 한다

public class ReturnExam {

	public static int sum(int a) {
		int result = 0;
		for(int i=1; i<=a; i++) {
			result = result + i;
		}
		return result; //메소드를 호출한 곳으로 값을 반환함
	}//sum 메소드
	
	public static void main(String[] args) {
		int n;
		n=sum(50); //sum메소드 호출한 후 리턴받은 값을 n에 저장
		System.out.println(n);
		
		n=sum(100); //메소드 재사용
		System.out.println(n);
	}//main

}
