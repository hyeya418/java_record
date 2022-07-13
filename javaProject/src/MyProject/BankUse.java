package MyProject;

public class BankUse {
	public static void main(String[] args) {
		MyBank bank = new MyBank();
		//각각의 객체 생성
		BankPlayer hong = new BankPlayer(1,bank);
		BankPlayer saim = new BankPlayer(2,bank);
		BankPlayer lee = new BankPlayer(3,bank);
	
		hong.start();
		saim.start();
		lee.start();
	}

}
