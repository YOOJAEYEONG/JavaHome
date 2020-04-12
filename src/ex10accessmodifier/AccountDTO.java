package ex10accessmodifier;

public class AccountDTO {
/*
	DTO클래스(Data Transfer Object)
		: 데이터 교환을 위한 객체이다. 스프링에서는 Bean이라고 
		부르기도 한다.
		주로 DTO객체는 로직을 전혀 가지고 있지 않은 순수한 데이터
		객체이며, 멤버변수에 접근하기위한 getter/setter메소드를
		가지고 있다.
		VO(Value Object)라고 부르기도 한다.
 
 */
	//1.속성(멤버변수)
	private String name;
	private String accountNumber;
	private int balance;
	
	//기본생성자, 인자생성자(필요한경우만)
	public AccountDTO() {}
	public AccountDTO(String name, 
			String accountNumber, int balance) {
		
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
//	2. getter / setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNUmber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
