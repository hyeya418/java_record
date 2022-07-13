package MyProject;
/*
 간단한 은행 프로그램
 조건:
 "[1]입금" 선택 시 금액 입력 후 예금액 합산 후 출력
 "[2]출금" 선택 시 금액 입력 후 남은 금액 출력
 "[3]잔고" 선택 시 현재 가지고 있는 금액 출력
 "[4]종료" 선택 시 종료
  1~4이외의 다른 숫자 입력 시 "다시 입력해주세요" 출력
 */

//예금,출금 기능 정의 클래스
public class Account {
	private int balance;//잔액
	public Account() {}//기본생성자
	
	//입금
	public int deposit(int money) {
		balance += money;
		return balance;
	}
	
	//출금
	public int withdraw(int money) {
		balance -= money;
		return balance;
	}
	
	//잔고
	public void showBalance() {
		System.out.println("잔액 : "+balance);
	}
	
}
