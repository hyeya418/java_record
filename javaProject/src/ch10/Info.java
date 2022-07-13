package ch10;

//만약 회사정보가 홈페이지에서 쓰일 때 여러파일에서 사용된다면 이처럼 상수화해서 값만 바꾸어주면 편하다.
public class Info {
	public static void main(String[] args) {
		//static변수는 객체생성없이 "클래스이름.변수이름"으로 호출 가능
		System.out.println("회사명 : " + Constants.COMPANY_NAME);
		System.out.println("전화번호 : " + Constants.TEL);
		System.out.println("주소 : " + Constants.ADDRESS);
	}
}
