package ch07;

public class EmployeeUse {

	public static void main(String[] args) { //가급적이면 메인메소드의 코드양을 줄이는게 좋음
		Employee e1 = new Employee(); //객체 생성
		e1.input("강감찬", "관리부", "과장", 400);
		e1.calc();
		e1.print();
	}

}
