package ex11static;


class MyStatic{
	
	int instanceVar;
		
	static int staticVar;
	
	void instanceMethod() {
		System.out.println("instancevar="+ instanceVar);
		System.out.println("staticvar = "+ staticVar);
		staticMethod();
	}
	
	static void staticMethod() {
		System.out.println("staticvar="+staticVar);
		//instanceMethod();
	}
	
}




public class E01StaticModifier {
	
	public static void main(String[] args) {
		
		MyStatic myStatic = new MyStatic();
		myStatic.instanceVar = 100;
		System.out.println("myStatic.instanceVar="
				+myStatic.instanceVar);
		
		MyStatic.staticVar = 200;
		System.out.println("MyStatic.staticVar="+MyStatic.staticVar);
		
		MyStatic.staticMethod();
	}
}













