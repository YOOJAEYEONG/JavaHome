package ex01start;

class noName{
	int var;
	static int static_var;
}
public class test extends noName {

	public static void main(String[] args) {
		
		int a;
//		System.out.println(a); // 에러
		
		System.out.println(static_var); // 0으로 자동 초기화
//		System.out.println(var); // 에러
	}
}
