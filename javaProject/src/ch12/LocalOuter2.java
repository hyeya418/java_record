package ch12;

public class LocalOuter2 {
	private int data = 20;
	void display() {
		int value=50; //지역변수
		
		class LocalInner2 { //메소드안에 있는 지역내부 클래스
			void msg() {
				System.out.println(value);
			}
		}//end inner class
		
		LocalInner2 li = new LocalInner2();
		li.msg();
	}//end display()
	
	public static void main(String[] args) {
		LocalOuter2 lo = new LocalOuter2();
		lo.display();
	}
}
