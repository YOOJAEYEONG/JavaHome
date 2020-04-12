package ex14innerclass;

class OuterMember{
	
	int outerInstanceVar;
	static int outerStaticVar;
	int sameVar = 1000;
	InnerMember inner;
	
	public OuterMember() {
		inner = new InnerMember();
	}
	void outerInstanceMethod() {
		System.out.println("외부의 sameVar" + sameVar);
		System.out.println("내부클래스의 상수"+InnerMember.MAX_INT);
		System.out.println("내부의 sameVar "+ inner.sameVar);
	}
	static void outerStaticMethod() {
		System.out.println(InnerMember.MAX_INT);
	}
	
	class InnerMember{
		int innerInstanceVar;
		int sameVar = 500;
		static final int MAX_INT = Integer.MAX_VALUE;
		
		void innerInstanceMethod() {
			outerInstanceMethod();
			outerStaticMethod();
			this.sameVar = sameVar;
			OuterMember.this.sameVar = sameVar;
		}
	}
}
public class E01InnerMemberClass {

	public static void main(String[] args) {
		
		OuterMember outerClass = new OuterMember();
		
		outerClass.inner.innerInstanceMethod();
		OuterMember.InnerMember in = outerClass.new InnerMember();
		OuterMember.InnerMember in2 = new OuterMember().new InnerMember();
		
	}
}

























