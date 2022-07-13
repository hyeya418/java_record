package MyProject;

public class BookStore {
	//멤버변수
	private String bookname;
	private String writer;
	private String publisher;
	private int year;
	private int price;
	private int sales;
	private int total;
	
	//getter, setter 추가
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public int getTotal() {
		total = price*sales;
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(bookname+"\t"+writer+"\t"+publisher+"\t"+year+"\t"+price+"\t"+sales+"\t"+getTotal());
	}
	


}
