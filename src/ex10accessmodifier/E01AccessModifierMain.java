package ex10accessmodifier;

import ex10accessmodifier.sub.E01AccessModifier2;

public class E01AccessModifierMain {

	public static void main(String[] args) {
		
		E01AccessModifier1 one = new E01AccessModifier1();
		
		
		System.out.println("one.defaultVar =" + one.defaultVar);
		System.out.println("one.publicVar = " + one.publicVar);
		
		one.defaultMethod();
		one.publicMethod();
		
		System.out.println("DefaultClass 객체 생성 및 접근");
		new DefaultClass().myFunc();
		
		///////////////////////////////////
		
		System.out.println("\t\t\t\t");
		
		System.out.println("E01AccessModifier2객체에 접근");
		
		
		E01AccessModifier2 two = new E01AccessModifier2();
		
		System.out.println(two.publicVar);
		//System.out.println(two.dafaultVar);
		
		
		two.publicMethod();
		
		System.out.println("DefaultClass 객체 생성 및 접근");
		
		//new DefaultClass2().myFunc();		

		
		
		
	}
}
