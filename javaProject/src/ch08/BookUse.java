package ch08;

public class BookUse {

	public static void main(String[] args) {
		Book b = new Book("Java", "홍길동", "영진", 2017, 35000, 5);
		b.input("DB", "아무개", "한빛", 2021, 25000, 3);
		//객체 생성과 동시에 매개변수가 6개인 생성자 호출
		b.print();
		
		Book b1 = new Book();
		b1.print();
	}

}