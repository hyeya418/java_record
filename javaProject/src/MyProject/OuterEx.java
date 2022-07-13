package MyProject;

import java.util.Scanner;

public class OuterEx {
	private int num;
	private String name;
	private String email;
	private String add;
	
	class InnerEx {
	   void print(int num, String name,String email, String add) {
			System.out.println("----------------------");
			System.out.println("고객번호 : " + num);
			System.out.println("이름: " + name);
			System.out.println("이메일 : " + email);
			System.out.println("주소 : " + add);
			System.out.println("----------------------");
		}
	}


	public static void main(String[] args) {
		OuterEx oe = new OuterEx();
		OuterEx.InnerEx in = oe.new InnerEx();
		
		in.print(2,"사임당","saim@gmail.com","서울시 강남구 역삼동");
	}
}
