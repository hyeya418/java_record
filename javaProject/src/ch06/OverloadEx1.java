package ch06;

public class OverloadEx1 {

	public static void main(String[] args) {
		print(10.5); //실수형 -> 3번
		print("hello"); //문자열 1개 -> 1번
		print(100); //정수형 -> 4번
		print("Hi","Java"); //문자열 2개 -> 2번
	}
	//1번
	static void print(String b) {
		System.out.println(b);
	}
	//2번
	static void print(String a, String b) { //오버로딩
		System.out.println(a);
		System.out.println(b);
	}	
	//3번
	static void print(double a) { //오버로딩
		System.out.println(a);
	}
	//4번
	static void print(int c) { //오버로딩
		System.out.println(c);
	}
	
//	static String print(int i) { //반환타입은 영향 x 오버로딩 x
//		System.out.println(i);
//	}
}
