package ex10accessmodifier;

public class AccountDAO {

/*
 * DAO(Data Acceess Object)
 * 	: 데이터베이스의 data접근을 위한 객체이다.
 * 주로 DB 접근을 위한 로직과 비즈니스로직을 분리하기위해
 * 사용한다. MVC패턴에는 M(Model)에 해당한다.
 * 
 * 해당 예제에서는 DB접속을 위한 목적은 아니고 DTO클래스에
 * 저장된 데이터를 가공/처리하는 로직을 구현하기 위한 목적으로
 * 제작되었다.
 */
	//멤버변수
	private AccountDTO capsule = new AccountDTO();
	
	//멤버메소드
	public void initial(String name, 
			String accNumber, int balance) {
		
		capsule.setName(name);
		capsule.setAccountNUmber(accNumber);
		capsule.setBalance(balance);
	}
	
	//저축
	public void deposit(int money) {
		capsule.setBalance(capsule.getBalance()+money);
		System.out.println(money + "원이 입금되었습니다");
		printAccount();
	}
	
	
	//출금
	public void withdraw(int money) {
		if(capsule.getBalance() < money) {
			System.out.println("잔액부족");
			return;
		}
		capsule.setBalance(capsule.getBalance()-money);
		System.out.println(money + "원이 출금됨");
		printAccount();
	}
	
	public void printAccount() {
		System.out.println(capsule.getName());
		System.out.println(capsule.getAccountNumber());
		System.out.println(capsule.getBalance());
	}
	
	
}
