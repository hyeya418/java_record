package MyProject;

public class BankPlayer extends Thread {
	//멤버 변수
	int type;
	MyBank myBank;
	
	public BankPlayer() {} //기본생성자

	public BankPlayer(int type, MyBank myBank) {
		this.type = type;
		this.myBank = myBank;
	}
	@Override
	public void run() {
		switch (type) {
		case 1: myBank.DepositeA(); 
				System.out.println(); break;
		case 2: myBank.DepositeB();
				System.out.println(); break;
		case 3: myBank.DepositeC();
				System.out.println(); break;
		}
	}//run()
}
