package ex12inheritance;


class A{
	public void rideMethod() {
		System.out.println("class A - rideMethod");
	}
	public void loadMethod() {
		System.out.println("class A - loadMethod");
	}
	
}

class B extends A{
	@Override
	public void rideMethod() {
		System.out.println("class B - rideMethod");
	}
	public void loadMethod(int num) {
		System.out.println("class B - loadMethod");
	}
}
class C extends B {
	
	public void rideMethod() {
		System.out.println("class C - rideMethod");
	}
	public void loadMethod(double num) {
		System.out.println("class C - loadMethod");
	}
}


public class E07RideAndLoad01 {

	public static void main(String[] args) {

		A ref1 = new C();
		B ref2 = new C();
		C ref3 = new C();
		
		System.out.println("오버라이딩 처리된 메소드");
		
		ref1.rideMethod();
		ref2.rideMethod();
		ref3.rideMethod();
		
		System.out.println("오버로딩처리된 메소드");
		
		ref1.loadMethod();
		ref2.loadMethod(1);
		ref3.loadMethod(1.1);
		
		System.out.println("C객체를 B타입으로 간주하고 참조");
		ref2.loadMethod();
		ref2.loadMethod(1);
//		ref2.loadMethod(1.1);
		
		System.out.println();
		
		A refNum1 = new B();
		A refNum2 = new C();
		A refNum3 = new C();
		
		C refAddr1 = new C();
		B refAddr2 = refAddr1;
		A refAddr3 = refAddr1;
		
		A refId1 = new C();
//		B refId2 = refId1;
//		C refId3 = refId1;
		C refId3 = (C)refId1;
		
		
		
		
	}

}






























