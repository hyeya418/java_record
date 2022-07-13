package MyProject;

import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {
	int money;
	int menuNo;
	Account account = new Account();
	
	Scanner sc = new Scanner(System.in);
	
	output:
	while(true) {
		System.out.println("====================================");
		System.out.println("[1]입금\t[2]출금\t[3]잔고\t[4]종료");
		System.out.println("====================================");
		System.out.print("메뉴를 선택하세요 > ");
		
		menuNo = sc.nextInt();
		switch(menuNo) {
		case 1:
			System.out.print("입금액을 입력하세요 > ");
			money = sc.nextInt();
			account.deposit(money);
			break;
			
		case 2:
			System.out.print("출금액을 입력하세요 > ");
			money = sc.nextInt();
			account.withdraw(money);
			break;
		case 3:
			account.showBalance();
			break;
		case 4:
			System.out.println("프로그램을 종료합니다");
			break output;
		default :
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			continue;
		}//switch
	}//while
	sc.close();
	}//main
}
