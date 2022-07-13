package ch10;

class T {
	private int num = 10;
	public void print() {
		System.out.println(num);
	}
}


public class FinalMethod2 extends T { //상속관계
	int num = 100;

	//non-static
	public void print() {//부모의 메소드가 final일때는 오버라이딩 불가
		
	}

	public static void main(String[] args) {
		FinalMethod2 f = new FinalMethod2();//객체 생성
		f.print();//인스턴스 메서드는 객체 생성 후 "참조변수.메서드이름()"으로 호출
		
	}
}
