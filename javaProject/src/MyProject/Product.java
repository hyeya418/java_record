package MyProject;
public class Product {
	private String name;
	private String company;
	private String date;
	private int cost;
	private int count;
	//getter,setter, 생성자 추가
	public Product() {
	}
	public Product(String name, String company, String date, int cost, int count) {
		super();
		this.name = name;		//제품명
		this.company = company; //제조사
		this.date = date; 		//제조일자
		this.cost = cost;		//단가
		this.count = count;		//금액
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
	//금액 계산 메소드
	public int cal() {
		return cost*count;
	}
	//출력 메소드
	public void print() {
		System.out.println(name+"\t"+company+"\t"+date+"\t"+cost+"\t"+count+"\t"+cal());
	}
	
	
}
