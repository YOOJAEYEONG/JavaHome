package ex11static;

class NoSingleTone{
	int instVar;
	public NoSingleTone() {}
	
}
class SingleTone{
	int sharVar;
	private static SingleTone single = new SingleTone();
	
	private SingleTone() {}
	public static SingleTone getInstance() {
		return single;
	}
	void print() {
		System.out.println("shareVar=" + sharVar);
	}
	
}
public class E03SingleToneDesignPattern {

	public static void main(String[] args) {
		
		SingleTone st2 = SingleTone.getInstance();
		st2.sharVar=100;
		
		SingleTone st3 = SingleTone.getInstance();
		st3.sharVar=200;
		
		
	}	
	
}











