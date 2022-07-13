package ch07;

public class AuctionUse {

	public static void main(String[] args) {
		Auction a = new Auction(); //클래스내의 기본생성자 호출
		a.setName("사임당");
		a.setUserid("saimdang");
		a.setMoney(150000);
		a.print();
	}

}
