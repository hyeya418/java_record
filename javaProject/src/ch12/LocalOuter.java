package ch12;
//지역내부 클래스(메소드안에 생성되는 클래스) => 유효범위가 메소드 내부
public class LocalOuter {
	private int data = 30;

	void display() {		
		class LocalInner {
			void msg() {
				System.out.println(data);
			}
		}//end inner class
		LocalInner li = new LocalInner(); 
		//지역내부 클래스는 반드시 해당 메소드안에서 객체생성을 해야 한다.
		
		li.msg();
		
	}//end display()

	public static void main(String[] args) {
		LocalOuter lo = new LocalOuter();
		lo.display();
	}
	
}
