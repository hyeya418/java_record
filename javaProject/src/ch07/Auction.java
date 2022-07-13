package ch07;

public class Auction {
	private String name;
	private String userid;
	private int money; //구매금액
	private String grade;//10만원 이상 : gold, 아니면 silver
	
//	public Auction() {}; //기본생성자 컴파일러가 자동으로 추가해 줌

	//getter, setter, toString()
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getGrade() {
		if(money>=10) {
			grade = "gold";
		}else {
			grade = "silver";
		}
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Auction [name=" + name + ", userid=" + userid + ", money=" + money + ", grade=" + grade + "]";
	}
	
	public void print() {
		System.out.println("이름\t아이디\t\t구매금액\t등급");
		System.out.println(name+"\t"+userid+"\t"+money+"\t"+getGrade());
	}//grade는 getGrade()메소드를 호출하여 값을 받음
	
	
	
}
