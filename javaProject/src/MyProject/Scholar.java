package MyProject;

public class Scholar extends Student{
//is a 관계 "장학생은 학생이다" 즉 상속관계에 있어 부모 멤버들을 그대로 쓸 수 있다.

	private String category; //장학금의 종류 
	private int money; //장학금액
	
	public void input(String name, String num, String major, int year, 
			String category, int money) {
		setName(name);
		setNum(num);
		setMajor(major);
		setYear(year);
		this.category = category;
		this.money = money;
		//super() => 조상의 생성자를 호출할 때 사용
		//super. 조상의 멤버를 자신의 멤버와 구별할 때 사용
		//this() => 현재 클래스에서 생성자에서 다른 생성자를 호출할 때 사용
		//this.인스턴스변수와 지역변수를 구별할 때 사용
		
	}
	
	public void print() {
		System.out.println("이름\t학번\t전공\t학년\t구분\t장학금액");
		System.out.println(getName()+"\t"+getNum()+"\t"+getMajor()+"\t"+getYear()
				+"\t"+category+"\t"+money);
	}
	
	public void print2() {
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(getName()+"\t"+getNum()+"\t"+getMajor()+"\t"+getYear());
	}
}	

	

