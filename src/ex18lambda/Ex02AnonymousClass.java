package ex18lambda;

interface IKosmo2{
	void studyLambda(String str);
}

public class Ex02AnonymousClass {

	public static void main(String[] args) {
		
		IKosmo2 kosmo2 = new IKosmo2() {
			
			@Override
			public void studyLambda(String str) {

				System.out.println(str+"을 공부하기위한 익명클래스를 만들었다");
			}
		};
		
		kosmo2.studyLambda("람다식");
	}
}
