package ex14innerclass;

class OuterClass{
	
	int outerMemberVar;
	void outerMemberMethod() {
		
	}
	
	static int outerStaticVar;
	static void outerStaticMethod() {
		
	}
	
	static class InnerStaticClass{
		
		int innerMemberVar;
		void innerMemberMethod() {
			
		}
		
		
		static int innerStaticVar;
		static void innerStaticMethod() {
			
		}
	}
}
public class E02InnerStaticClass {

	public static void main(String[] args) {
		
		OuterClass.InnerStaticClass.innerStaticVar = 1;
		OuterClass.InnerStaticClass.innerStaticMethod();
		
		OuterClass.InnerStaticClass innerStaticClass = 
				new OuterClass.InnerStaticClass();
		
		innerStaticClass.innerMemberVar = 2;
		innerStaticClass.innerMemberMethod();
		
		
		OuterClass outerClass = new OuterClass();
		
		outerClass.outerMemberVar = 3;
		outerClass.outerMemberMethod();
		
		OuterClass.outerStaticVar = 4;
		OuterClass.outerStaticMethod();
	}
}

























