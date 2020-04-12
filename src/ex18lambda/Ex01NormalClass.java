package ex18lambda;

interface IKosmo1{
	void studyLambda(String str);
}

class KosmoStudent1 implements IKosmo1{
	
	@Override
	public void studyLambda(String str) {
		// TODO Auto-generated method stub
		System.out.println(str + "을 공부합니다.");
	}
}
public class Ex01NormalClass {

	public static void main(String[] args) {
		
		IKosmo1 kosmo;
		kosmo = new KosmoStudent1();
		kosmo.studyLambda("람다식");
	}
}
