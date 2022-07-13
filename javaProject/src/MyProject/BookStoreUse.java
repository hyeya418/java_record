package MyProject;

public class BookStoreUse {

	public static void main(String[] args) {
		BookStore b = new BookStore();
		b.setBookname("Java");
		b.setWriter("김선생");
		b.setPublisher("영진");
		b.setYear(2022);
		b.setPrice(30000);
		b.setSales(10);
		
		b.print();
	}

}
