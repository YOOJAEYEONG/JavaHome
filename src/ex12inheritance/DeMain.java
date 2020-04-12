package ex12inheritance;

public class DeMain {

	public static void main(String[] args) {

		DeChild deChild = new DeChild("영수", 18, "202022112");
		
		deChild.study();
		//deChild.eat();
		deChild.sleep();
		deChild.walk(25);
		deChild.walk();
		deChild.exercise();
		deChild.printParent();
		DeChild.staticMethod();
		
		DeParent deParent = new DeParent();
		
		System.out.println("------------");
		deParent.sleep();
		deParent.walk();
		deParent.exercise();
		deParent.printParent();
		DeParent.staticMethod();
		
	}
}
