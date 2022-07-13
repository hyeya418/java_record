package MyProject;

import java.util.Scanner;

public class Product2 {
	private String num;		//제품번호
	private String name;	//제품명
	private String company;	//제조사
	private String date;	//제조일자
	private int cost;		//단가
	private int count;		//수량
	private int price;//판매금액(단가*수량)
	
	//입력용 메소드
	public void input() {
		Scanner sc = new Scanner(System.in);		
		System.out.print("제품번호 : ");
		num = sc.next();
		System.out.print("제품명 : ");
		name = sc.next();
		System.out.print("제조사 : ");
		company = sc.next();
		System.out.print("제조일자 : ");
		date = sc.next();
		System.out.print("단가 : ");
		cost = sc.nextInt();	
		System.out.print("수량 : ");
		count = sc.nextInt();
		
		price =  cost*count;
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
