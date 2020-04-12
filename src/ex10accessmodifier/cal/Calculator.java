package ex10accessmodifier.cal;

class Adder{
	private int cntAdd;
	
	Adder(){
		cntAdd = 0;
	}
	
	public int getCntAdd() {
		return cntAdd;
	}
	
	int addTwoNumber(int n1, int n2) {
		cntAdd++;
		return n1+n2;
	}
}

class Subtractor{
	private int cntSub;
	public Subtractor() {
		cntSub = 0;
	}
	
	public int getCntSub() {
		return cntSub;
	}
	
	
	
	int subTwoNumber(int n1, int n2) {
		cntSub++;
		return n1-n2;
	}
}


public class Calculator {

	private Adder adder;
	private Subtractor subtractor;
	
	public Calculator() {
		adder = new Adder();
		subtractor = new Subtractor();
	}
	
	public int addTwoNumber(int n1, int n2) {
		return adder.addTwoNumber(n1, n2);
	}
	
	public int subTwoNumber(int n1, int n2) {
		return subtractor.subTwoNumber(n1, n2);
	}
	public void showOpratingTimes() {
		System.out.println("덧셈횟수 : " + adder.getCntAdd());
		System.out.println("뺄셈횟수 : " + subtractor.getCntSub());
	}
	
}





































