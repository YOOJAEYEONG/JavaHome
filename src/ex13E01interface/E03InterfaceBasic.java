package ex13E01interface;


interface Myinterface1{
	
	public static final int MAX_INT = Integer.MAX_VALUE;
	double MAX_DBL = Double.MAX_VALUE;
	
	//멤버추상메소드
	public abstract void absFunc1();
	void absFunc2();
	void mySample();
}

interface MyInterface2{
	void absFunc2();
}


class SampleClass{
	int sample = 1;
	void mySample() {
		System.out.println("sample = " + sample);
	}
}

class MyClass extends SampleClass implements Myinterface1, MyInterface2{
	
	@Override
	public void absFunc1() {
		System.out.println("absFunc1이 호출됨");
	}
	
	@Override
	public void mySample() {
		System.out.println("상속받은 smapleClass");
	}
	
	@Override
	public void absFunc2() {
		System.out.println("상속받은 absFunc2가 호출됨");
	}
	
	
	
	
	
}

public class E03InterfaceBasic {

	public static void main(String[] args) {
		Myinterface1 my1 = new MyClass();
		
		my1.absFunc1();
		my1.absFunc2();
		my1.mySample();
	}
	
}























