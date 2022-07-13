package ch06;

//프로그램 실행은 항상 메인메소드 첫 줄부터 순차적으로 실행함!!!!!!

public class CallEx {

	 //test 메소드
	public static void test(int b) { //b=10
		System.out.println("test method 호출");
		System.out.println(b);
	} 
	
	 //main메소드
	public static void main(String[] args) {
		System.out.println("시작");
		int a = 10; //지역변수
		test(a); //a는 call by value형식으로 호출
		
		test2(a);
		System.out.println("끝");
		
	}
	
	//test2 메소드
	public static void test2(int a) { //a=10
		System.out.println(a);
	}
	
}
