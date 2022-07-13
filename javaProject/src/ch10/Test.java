package ch10;

public class Test {
	static int a; //static 멤버 변수
	int b;		  //non-static 멤버 변수(인스턴스 변수)
	
	void print() { //non-static 멤버 메소드 (인스턴스 메소드)
		System.out.println(a);//static멤버는 언제나 항상 사용가능
		System.out.println(b);//인스턴스메소드에서 iv사용가능
	}
	
	public static void main(String[] args) {
		System.out.println(a); //static메소드에서 cv사용가능
		
		Test t = new Test(); 	 //객체 생성
		System.out.println(t.b); //인스턴스 변수는 객체 생성 후 사용 가능
		System.out.println(t);   //참조변수 주소 값
		t = null; 				 //참조변수 t가 주소값을 잃고 메모리에서 해당 객체는 떠돌아 다니게 됨.
		System.out.println(t);		
	}
}
