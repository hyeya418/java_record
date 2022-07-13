package ch12;

public class InnerExam1 {
	class Cal {
		int value = 0;
		public void plus() {
			value++;
		}//외부클래스
	}//내부클래스 
	
	
	public static void main(String[] args) {
		//1.외부클래스를 인스턴스화한다.
		InnerExam1 t = new InnerExam1(); 
		//2. 외부클래스.내부클래스 참조변수 = 외부클래스의 참조변수.new 내부클래스 생성자;
		InnerExam1.Cal cal = t.new Cal();
		
		cal.plus();
		System.out.println(cal.value);
		
	}
}
