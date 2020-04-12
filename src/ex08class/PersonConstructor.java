package ex08class;

public class PersonConstructor {

	
	String name;
	int age;
	String address;
	
	//public PersonConstructor() {}
	
	//생성자 1 : 기본 생성자
	public PersonConstructor() {
		name = "이름없음";
		age = 00;
		address = "주소미상";
		System.out.println("나는 기본 생성자이다.");
	}
	//new PersonConstructor(); 생성자 호출방법
	
	//생성자2 : 인자생성자
	public PersonConstructor(String name2) {
		this.name = name2;
		age = 1;
		address = "주소2";
	}
	
	public PersonConstructor(String name, int age) {
		this(name, age, "[주소]-this()를 이용한 생성자 호출");
		System.out.println("나는 생성자 2입니다. this ()를 사용함.");
	}
	
	public PersonConstructor(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	void initialize(String name, int age, String addr) {
		
		//또다른 생성자를 호출하는 구문
		//this(name, age, "미상");//this()는 생성자 내에서만 사용할 수있다.
		
		//멤버변수를 구분하기위한 this는 사용가능.
		this.name = name;
		this.age = age;
		this.address = addr;
	}
	
	void showPersonInfo() {
		System.out.println(this.name + "의 정보");
		System.out.println(name + "의 정보");
		System.out.println("나이 : " + age);
		System.out.println("주소 "+ address);
	}
	
	
	
	
}
