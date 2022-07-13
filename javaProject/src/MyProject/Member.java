package MyProject;

public class Member {
	private String name;//이름
	private String userid;//아이디
	private int price;//구매금액
	private String grade;//등급
	
	public Member() {}//기본 생성자
					  //생성자를 만들 땐 기본생성자를 함께 만드는 습관을 들이기
	
	public Member(String name, String userid, int price) { //매개변수가 3개인 생성자 
		this.name = name;
		this.userid = userid;
		this.price = price;
		if(price>=100000) {
			grade = "gold";
		}else if(price>=50000) {
			grade = "silver";
		}else {
			grade = "bronze";
		}
	}

	public void showInfo() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+userid+"\t"+price+"\t"+grade);
	}
}
