package ch15;

public class ExceptionExam {
	//에러 Error - 컴파일 오류
	//경고 Warning - 에러는 아니지만 잠재적인 문제륿 발생시킬 수 있는 코드
	//예외 Exception - 실행하면서 오류가 발생하는 경우
	//예외처리 발법 try-catch 직접처리
	
	public static void main(String[] args) {
		int a = 10, b=0, c;
		try {//예외가 발생할 가능성이 있는 코드
			c = a/b; //분모에 0이 있는 산술 연산
			System.out.println(c);
		} catch (Exception e) { //잘 모를때는 Exception만 해도 된다.
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
			//예외가 발생한 이유와 범위를 알려주는 메소드
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
