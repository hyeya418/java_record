package ch09;

public class BookSaleUse {
	public static void main(String[] args) {
		BookSale b1 = new BookSale();//객체생성과 동시에 기본생성자 호출
		//부모클래스의 멤버 호출
		b1.setBookName("Jaba");
		b1.setPress("길벗");
		b1.setAuthor("홍길동");
		b1.setYear(2020);
		b1.setPrice(30000);
		//자식클래스의 멤버 호출
		b1.setAmount(500);
		b1.setMoney();
		b1.setRank(1);
		b1.print();
	}

}
