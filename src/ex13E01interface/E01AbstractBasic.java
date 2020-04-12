package ex13E01interface;

//추상클래스 1 - 추상 메소드르 포함하지 않는 추상 클래스

abstract class AbsClass1{
	
	public static final int MAX_INT = Integer.MAX_VALUE;
	
	int instavceVar;
	static int staticVar;
	void instanceMethod() {}
	static void staticMethod() {}
	
}
abstract class absClass2{
	abstract void absMethod(int number);
}
class absClassChild2 extends absClass2{
	@Override
	void absMethod(int number) {
		System.out.println("부모클래스에서 오버라이딩한 메소드, 없다면 에러발생");
	}
	void newMethod() {
		System.out.println("자식클래스에서 새롭게 확장한 메소드");
	}
}
class AbsClassChild1 extends AbsClass1{
	int newVar;
	void newMethod() {}
	
	@Override
	void instanceMethod() {
		System.out.println("필요없다면 오버라이딩 하지 않아도 상관없다.");
	}
}



public class E01AbstractBasic {

	public static void main(String[] args) {
		
		AbsClassChild1 absClassChild1 = new AbsClassChild1();
		
		absClass2 absClass2 = new absClassChild2();
		absClass2.absMethod(100);
		((absClassChild2)absClass2).newMethod();
		
		AbsClass1.staticMethod();
		AbsClassChild1.staticMethod();
		
		
	}
}




























