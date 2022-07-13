package MyProject;

public class Student {
	//멤버변수
	//protected 접근범위 : 같은 패키지+다른패키지 자손클래스
	//private 접근 범위 : 같은 클래스
	private String name;
	private String num;   //학번
	private String major; //전공
	private int year;	  //학년
	
	//getter, setter추가
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Student() {} //기본생성자
	
	//매개변수가 4개인 생성자
	public Student(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	
	//매개변수가 4개인 메소드
	public void input (String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	
	
}
