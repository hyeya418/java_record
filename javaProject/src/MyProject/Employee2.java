package MyProject;

public class Employee2 {//조상클래스
	protected String num; 	 //사원번호
	protected String name;	 //이름
	protected String address;//주소
	protected String email;	 //이메일

	//기본생성자
	Employee2() {}
	//매개변수가 4개인 생성자
	public Employee2(String num, String name, String address, String email) {
		this.num = num;
		this.name = name;
		this.address = address;
		this.email = email;
	}
	

	
	
}
