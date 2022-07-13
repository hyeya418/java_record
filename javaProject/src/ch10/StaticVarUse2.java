package ch10;

public class StaticVarUse2 {
	public static void main(String[] args) {
		System.out.println(StaticVar2.total); 
		//다른 클래스에서 static멤버를 사용할 때 "클래스이름.static멤버"로 사용
		
		StaticVar2 car1 = new StaticVar2("쏘나타");//객체생성과 동시에 매개변수 1개인 생성자 호출
		System.out.println(car1); //주소값 출력
		StaticVar2 car2 = new StaticVar2("모닝");//객체생성과 동시에 매개변수 1개인 생성자 호출
		System.out.println(car2); //주소값 출력
		StaticVar2 car3 = new StaticVar2("아반떼");//객체생성과 동시에 매개변수 1개인 생성자 호출
		System.out.println(car3); //주소값 출력
		System.out.println("===========================");
		
		System.out.println(car1.model);
		System.out.println(car2.model);
		System.out.println(car3.model);
		//인스턴스 변수는 객체생성 후에 "참조변수.멤버이름"으로 호출 가능
		
		System.out.println(StaticVar2.total);
		//static변수는 객체생성없이 "클래스명.멤버이름"으로 호출 가능
	
		
		//static은 객체와는 별개로 공용의 주소(메모리영역)에서 사용되어진다.
	}
}
