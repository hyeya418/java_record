package ch13;

//인스턴스(객체)를 복제하려면 Cloneable 인터페이스를  implements해야한다.
public class Clone implements Cloneable {
	int num = 10;
	void print() {
		System.out.println(num);
	}
	public static void main(String[] args) {
		Clone t1 = new Clone(); //인스턴스 멤버를 사용하기 위해 객체 생성
		Clone t2 = null; 
		
		//예외가 발생할 가능성이 있는 코드
		try { 
			t2=(Clone)t1.clone(); //인스턴스를 복제함~!
			//좌변 t2는 Clone으로 자식
			//우변은 Object로 부모
			//clone()은 Object의 메소드이므로 Object타입
			//좌,우변을 맞추기 위해 (Clone)으로 형변환해주어야 한다.
			
		//예외발생
		} catch (CloneNotSupportedException e) {
			e.printStackTrace(); //개발자를 위한 디버깅 정보 제공
		}
		System.out.println(t1);
		System.out.println(t2);
		t1.print();
		t2.print();
	}
}
