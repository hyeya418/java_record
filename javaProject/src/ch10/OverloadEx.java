package ch10;

public class OverloadEx {
	
	//오버로딩 : 메소드 이름은 같고 매개변수의 개수나 타입이 다른 것
	public void putData(String a) {
		System.out.println(a);
	}
	public void putData(int a) {
		System.out.println(a);
	}
	public void putData(double a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		OverloadEx o = new OverloadEx();
		//인스턴스 메서드는 객체 생성후 "참조변수.멤버이름"으로 호출 가능
		o.putData("hello");
		o.putData(21);
		o.putData(21.3);
		
	}

}
