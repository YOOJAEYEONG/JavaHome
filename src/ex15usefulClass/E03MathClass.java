package ex15usefulClass;


public class E03MathClass {

	public static void main(String[] args) {
		
		System.out.println("원주율:" + Math.PI);
		
		float f = -3.14F;
		double d = -100.9;
		int i = -10;
		
		System.out.println("Math.abs() "+ Math.abs(f));
		System.out.println("Math.abs() "+ Math.abs(d));
		System.out.println("Math.abs() "+ Math.abs(i));
		System.out.println();
		System.out.println("Math.ceil(): "+ Math.ceil(f));
		System.out.println("Math.ceil(): "+ Math.ceil(d));
		System.out.println("Math.ceil(): "+ Math.ceil(i));
		System.out.println();
		System.out.println("Math.floor(): "+ Math.floor(f));
		System.out.println("Math.floor(): "+ Math.floor(d));
		System.out.println("Math.floor(): "+ Math.floor(i));
		System.out.println();
		System.out.println("Math.round(): "+ Math.round(3.1499));
		System.out.println("Math.round(): "+ Math.round(3.5444));
		System.out.println("Math.round(): "+ Math.round(-1.4));
		System.out.println();
		System.out.println("Math.max(a,b): " + Math.max(23, 45));
		System.out.println("Math.min(a,b): " + Math.min(23, 45));
		System.out.println();
		System.out.println(Math.random());
		System.out.println();
		System.out.println("3의 5승은? "+ Math.pow(3, 5));
		
		
		
	}
}














