package MyProject;

public class Manager2 extends Employee2 {
	private int salary;//연봉
	private String rrn;//주민등록번호
	private int bonus; //보너스(연봉의30%)
	
	//기본 생성자
	Manager2() {}
	//매개변수가 6개인 생성자
	public Manager2(String num, String name, String address, String email,
				int salary, String rrn) {
		super(num, name, address, email); //조상의 생성자 호출
		this.salary = salary;
		this.rrn = rrn;
	}
	
	//보너스 계산용 메소드
	public void calc() {
		bonus = (int)(salary*0.3);
	}

	
	//출력용 메소드
	public void print() {
			System.out.println("------------------------------------");
			System.out.println("사원번호 : "+num);
			System.out.println("이름 : "+name);
			System.out.println("주소 : "+address);
			System.out.println("이메일 : "+email);
			System.out.println("이름 : "+salary);
			System.out.println("주민번호 : "+rrn);
			System.out.println("보너스  : "+bonus);
			System.out.println("------------------------------------");

		}
	}

