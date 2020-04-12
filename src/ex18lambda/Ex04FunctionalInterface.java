package ex18lambda;


@FunctionalInterface
interface IKosmo4{
	void studyLambda(String str);
}


public class Ex04FunctionalInterface {
	
	static void execute(IKosmo4 ko, String s) {
		ko.studyLambda(s);
	}
	public static void main(String[] args) {
		
		IKosmo4 kosmo = str -> {
			System.out.println("IKosmo4를 구현받아 정의한 람다입니다." + str);
		};
		
		execute(kosmo, "\n람다를 매개변수로 전달합니다.");
		
	}
}
