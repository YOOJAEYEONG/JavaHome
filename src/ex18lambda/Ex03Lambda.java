package ex18lambda;


interface IKosmo3{
	void studyLambda(String str);
}



public class Ex03Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IKosmo3 kosmo1 = (String str) -> {
			System.out.println(str + "을 드디어 써보네요");
		};
		kosmo1.studyLambda("람다식");
		
		
		IKosmo3 kosmo2 = str -> System.out.println(str+"완전간단!!");
		
		
		kosmo2.studyLambda("람다식");
		
		
	}

}
