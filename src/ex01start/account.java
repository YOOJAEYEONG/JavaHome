package ex01start;


class Bank{
	
	private String accNumber, accOwner;
	private int mymoney;
	
	public Bank(String accNumber, String accOwner, int mymoney) {
		this.accNumber = accNumber;
		this.accOwner = accOwner;
		this.mymoney = mymoney;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public String getAccOwner() {
		return accOwner;
	}
	public int getMymoney() {
		return mymoney;
	}
	public void inputMoney(int money) {
		mymoney += money;
	}
	public void withdrawMoney( int money) {
		if(money>mymoney) {
			System.out.println("잔액부족");
			return;
		} 
		else {
			mymoney -= money;
			System.out.println("인출금액"+money);
		}
	}
	public void showInfo() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return String.format("예금주: %s\n계좌번호: %s\n잔액:%d", accOwner,accNumber,mymoney);
	}
}

public class account {

	public static void main(String[] args) {

		Bank bank = new Bank("123-456", "김길동", 15000);
		bank.showInfo();
		bank.inputMoney(1000);
		bank.showInfo();
		bank.withdrawMoney(5000);
		bank.showInfo();

	}
}
