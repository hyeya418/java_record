package ch10;

public class StaticVar {
	static int a = 10; //static 멤버 변수
	int b = 20; //non-static 멤버 변수 (인스턴스 변수)
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(StaticVar.a);
		//static멤버는 "클래스이름.static멤버"로 접근해 사용가능하다.
		
		StaticVar s = new StaticVar();//객체 생성
		System.out.println(s.b);
		//인스턴스 멤버는 "참조변수.인스턴스멤버"로 접근해 사용가능하다.
		
		
	}
}
