package MyProject;

public class BookStore2 {
	//멤버변수
	private String bookname;
	private String writer;
	private String publisher;
	private int year;
	private int price;
	private int sales;
	private int total;

	public void input(String bookname,String writer,String publisher,int year, int price, int sales) {
		this.bookname = bookname;
		this.writer = writer;
		this.publisher = publisher;
		this.year = year;
		this.price = price;
		this.sales = sales;
		total = price*sales;
	}
	
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(bookname+"\t"+writer+"\t"+publisher+"\t"+year+"\t"+price+"\t"+sales+"\t"+total);
	}

}