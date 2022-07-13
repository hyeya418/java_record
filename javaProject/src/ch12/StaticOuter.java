package ch12;

//정적 중첩클래스(static 내부클래스)
public class StaticOuter {
	static int data = 30;
	int data2 = 50;
	
	static class StaticInner { //static클래스에서 인스턴스멤버 사용불가.
		void msg() {
			System.out.println("data is "+data); //static멤버
//			System.out.println("data is "+data2);//non-static멤버
		}
	}
	
	public static void main(String[] args) {
		//static 내부클래스는 생성시
		//외부클래스이름.내부클래스이름.참조변수 = new.외부클래스이름.내부클래스 생성자;
		StaticOuter.StaticInner in = new StaticOuter.StaticInner();
		in.msg();
	}
}
