package ex15usefulClass;

class IntNumber{
	int num;
	public IntNumber(int num) {
		this.num = num;
	}
	public boolean myEquals(IntNumber numObj) {
		if(this.num==numObj.num) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class E04Object2MyEquals {

	public static void main(String[] args) {
		
		String str1 = new String("우린 KOSMO");
		String str2 = "KOSMO는 우리";
		
		if(str1.equals(str2)) {
			System.out.println("같은문자열이다");
		}
		else {
			System.out.println("다른 문자열이다");
		}
		
		/*
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(20);
		IntNumber num3 = new IntNumber(10);
		
		if(num1.myEquals(num2)) {
			System.out.println("num1==num2");
		}
		else {
			System.out.println("num1!=num2");//출력됨
		}
		
		if(num1.myEquals(num3)) {
			System.out.println("num1==num3");//출력됨
		}
		else {
			System.out.println("num1!=num3");
		}
		*/
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(20);
		IntNumber num3 = new IntNumber(10);
		
		System.out.println("num1="+num1);
		System.out.println("num3="+num3);
		
		
		System.out.println("\n\n");
		
		System.out.println(num1.num);
		System.out.println(num1);
		// equals()
		if(num1.equals(num3)) 
			System.out.println("equals를 사용+num1, num3 이 같다");
		else 
			System.out.println("equals를 사용 num1, num3이 다르다");//출력됨
		
		
		System.out.println();
		// == 
		if(num1.num==num3.num)
			System.out.println("==를 사용 num1, num3이 같다");
		else
			System.out.println("==를 사용 num1, num3이 다르다");//출력됨

		
		System.out.println();
		// myEquals()
		if(num1.myEquals(num3)) 
			System.out.println("myEquals()사용 num1, num3이 같다");//출력됨
		else 
			System.out.println("myEquals()사용 num1, num3이 다르다");
		
		
	}
}
