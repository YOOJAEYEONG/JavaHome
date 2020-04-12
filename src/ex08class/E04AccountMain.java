package ex08class;


class Account {
	
	String name;
	String accountNumber;
	int balance;
	
	void deposit(int money) {
		balance += money;
		System.out.println(money+"원이 입금됨");
	}
	void withdraw(int money) {
		
		if(balance >= money) {
			balance -= money;
			System.out.println(money+"원이 출금됨");
		}
		else
			System.out.println("잔고부족");
		
			
	}
	
	
	
	void init(String _name, String _accountNumber, int _balance) {
		name = _name;
		accountNumber = _accountNumber;
		balance = _balance;
	}
	void showAccount() {
		System.out.println("예금주"+name);
		System.out.println("계좌번호:"+accountNumber);
		System.out.println("잔고"+balance);
	}
	
}


public class E04AccountMain {

	public static void main(String[] args) {

		Account account = new Account();
		
		account.init("정우성", "423-253-123", 1000);
		
		account.showAccount();
		
		Account account2 = new Account();
		
		account.name = "김우빈";
		account.accountNumber = "4231-4132-2341";
		account.balance = 50000;
		account.showAccount();
	}

}




























