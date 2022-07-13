package ch06;

public class EchoEx {
	public static void echo(String s, int n) { 
		//매개변수의 개수,데이터 타이블 반드시 맞추어 줘야한다.
		for(int i=0; i<n; i++) {
			System.out.println(s);
		}
		return; // 반환값이 없는 void는 리턴생략가능
	}//echo메소드 
	
	public static void main(String[] args) {
		echo("안녕!", 3);
	}//main

}
