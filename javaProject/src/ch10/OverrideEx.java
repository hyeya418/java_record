package ch10;

class Test11 {
	//오버라이딩은 메소드의 선언부(리턴타입, 매개변수 목록)가 동일해야 함.
	
	public void print() {
		System.out.println("test11");
	}
}

class Test22 extends Test11 {//상속관계
	public void print() { //메소드 오버라이딩
		System.out.println("test22");
	}
}


public class OverrideEx {
	public static void main(String[] args) {
		Test22 t2 = new Test22();
		t2.print(); 
		Test11 t1 = new Test11();
		t1.print();
	}
	
}
