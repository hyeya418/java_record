package ch10;

/*
final변수(상수)
1)값을 변경할 수 없음
2)초기값이 반드시 필요함
3)대문자로 작성, 2단어 이상일 경우 _로 연결
*/


public class FinalVar {
	//전역변수(멤버변수)
	
	final static int MAX_NUM = 500; //변수에 final을 붙이면 상수이므로 값 변경 불가
//	static int MAX_NUM = 500; //상수는 전역변수화 해도 선언만하면 안되고 초기화 해줘야함
	
	public static void main(String[] args) {
		int max = 100;
		System.out.println(max);
		
		System.out.println(MAX_NUM);
//		MAX_NUM = 200; //상수는 값을 변경할 수 없음
	}

}
