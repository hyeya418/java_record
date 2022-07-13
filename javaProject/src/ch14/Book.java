package ch14;

import java.util.Scanner;

public class Book {
	private String bookName;
	private String press;
	private int price;
	private int amount;
	private int money;//판매금액(단가*수량)
	//스캐너 메소드
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("도서명 : ");
		bookName = scan.next();
		System.out.println("출판사 : ");
		press = scan.next();
		System.out.println("단가 : ");
		price = scan.nextInt();
		System.out.println("수량 : ");
		amount = scan.nextInt();
		
		money = price*amount;
	}
	
	public String getbookName() {
		return bookName;
	}
	public void setbookname(String bookName) {
		bookName = bookName;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	

}
