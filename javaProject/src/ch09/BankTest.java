package ch09;
//메소드 오버라이딩

class Bank {//조상클래스
	double getInterestRate() {  //선언부는 조상메서드와 같게
		return 0.0;				//구현부의 내용은 다르게
	}
}

class BadBank extends Bank {
	double getInterestRate() { //메소드 오버라이딩(재정의)
		return 10.0;
	}
}

class NormalBank extends Bank {
	double getInterestRate() { //메소드 오버라이딩(재정의)
		return 5.0;
	}
}
	

class GoodBanke extends Bank {
	double getInterestRate() { //메소드 오버라이딩(재정의)
		return 3.0;
	}
}


public class BankTest {
	public static void main(String[] args) {
		BadBank b1 = new BadBank();
		NormalBank b2 = new NormalBank();
		GoodBanke b3 = new GoodBanke();
		
		System.out.println("BadBank의 이자율 : " + b1.getInterestRate());
		System.out.println("NormalBank의 이자율 : " + b2.getInterestRate());
		System.out.println("GoodBank의 이자율 : " + b3.getInterestRate());
		
		
	}

}
