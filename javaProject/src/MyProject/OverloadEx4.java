package MyProject;

public class OverloadEx4 {

	public static void main(String[] args) {
		print("홍길동",3000,0,0);
	}
	

	
	static void print(String name, int salary, int tax, int total) {
		
		System.out.println("이름\t급여\t세금\t실수령액");
		System.out.println(name+"\t"+salary+"\t"+(int)(salary*0.03)+"\t"+(int)(salary-(salary*0.03)));
		
		
	}

}
