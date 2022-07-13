package ch05;

public class ArgsEx {
	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println(i+"번째 매개변수 : " + args[i]);
			}

	}
	
}
//ain() 매개 변수
//자바 프로그램의 main()메소드는 String[] args 라는 문자열 배열 형태의
//매개변수를 가지고 있어서 명령어 프롬프트에서 프로그램을 실행시킬 때
//주는 인수들이 저장된다. (이클립스에서 사용할 때는 Run Configurations에서
//Arguments탭에 데이터들을 입력하여 사용함.)

//실행 : Run – Run Configurations