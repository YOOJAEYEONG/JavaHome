package ex10accessmodifier;



class DefaultClass{
	
	void myFunc() {
		System.out.println("DefaultClass의 myFunc() 호출");
	}
}
public class E01AccessModifier1 {

	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	private void privateMethod() {
		privateVar = 100;
		System.out.println("privateMethod()호출");
	}
	void defaultMethod() {
		defaultVar = 200;
		System.out.println("deafaultMethod()호출");
	}
	public void publicMethod() {
		privateVar = 300;
		System.out.println("publicMethod호출");
		privateMethod();
	}
	
	
	
	
	
}
