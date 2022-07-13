package MyProject;

public class Person {
	//멤버변수
	private String name;
	private int age;
	private String email;
	private String address;
//	private double height;

	//이름
	//setter : set+변수명 
	public void setName(String name) { //name 지역변수
		this.name = name;  	//this => 멤버변수iv를 가리킴
		//멤버변수와 지역변수의 이름이 같을 때 멤버변수 앞에 this를 붙인다.
	}
	
	//getter : get+변수명
	public String getName() {
		return name;
	}
	
	//나이
	public void setAge(int age) {
		if(age<0 || age > 150 ) {
			System.out.println("입력값이 정확하지 않습니다.");
		}else {
			this.age = age;
		}
	}
	public int getAge() {
		return age;
	}

	//이메일
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
	
	//주소
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	//출력
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " +age);
		System.out.println("이메일 : " +email);
		System.out.println("주소 : " +address);
	}
//	public void setHeight(double height) {
//		this.height = height;
//	}
//	
//	public double getHeight() {
//		return height;
//	}

}
