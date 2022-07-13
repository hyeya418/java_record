package MyProject;

class Pa3 {//조상
	int num = 10;
	String name = "홍길동";
	public void print() {
		System.out.println("사번 : "+num);
		System.out.println("이름 : "+name);
	}
	
}

class Ch3 extends Pa3 { //자손
	String email = "hong@gmail.com";
	String ph = "010-1234-5678";
	String addr = "서울 강남구 역삼동";
	
	@Override
	public void print() {
		super.print();//조상의 print() 메소드 호출
		System.out.println("이메일 : "+email);
		System.out.println("전화 : "+ph);
		System.out.println("주소 : "+addr);
	}
	
}

public class Poly3 {
	public static void main(String[] args) {
		Pa3 p = new Ch3(); //조상타입 참조변수로 자손타입 객체를 다룰 수 있다.(다형성)
		p.print();
		
//		Ch3 c = new Pa3(); 
//		자손타입 참조변수로 조상타입 객체를 다룰 수 없다.
		
		//참조변수의 형변환 가능여부 확인용 
		System.out.println("p instanceof Ch3 :" + (p instanceof Ch3)); 
		
	}

}
