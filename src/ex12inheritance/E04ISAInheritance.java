package ex12inheritance;

class Computer{
	
	String owner;
	
	public Computer(String name) {
		owner = name;
	}
	private void keyboardTouch() {
		System.out.println("키보드를 통해서 입력한");
	}
	private void calculate() {
		System.out.println("요청한 내용을 계산한다.");
	}
	
	public void calculateFunc() {
		keyboardTouch();
		calculate();
	}
}

class NotebookComputer extends Computer{
	
	int battary;
	
	public NotebookComputer(String name, int initCharge) {
		super(name);
		battary = initCharge;
	}
	
	public void charging() {
		battary += 5;
	}
	public void movigcal() {
		if(battary <1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		System.out.println("이동하면서");
		
		calculateFunc();
		battary--;
	}
	
}
class TabletNoteBook extends NotebookComputer{
	String registPencil;
	
	public TabletNoteBook(String name, int initCharge, String pen) {
		
		super(name, initCharge);
		
		registPencil = pen;
	}
	
	public void write(String penInfo) {
		if(battary < 1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;	
		}
		if(registPencil.compareTo(penInfo) != 0) {
			System.out.println("등록된 펜이 아닙니다");
			return;
		}
		movigcal();
		System.out.println("스크린에 펜으로 그림으 ㄹ그린다");
		battary--;
	}	
}
public class E04ISAInheritance {

	public static void main(String[] args) {

		NotebookComputer notebook = new NotebookComputer("공유", 5);
		TabletNoteBook tablet = 
				new TabletNoteBook("이동욱", 5, "ISE-1234");
		
		System.out.println("=====노트북컴퓨터사용=====");
		
		notebook.movigcal();
		notebook.movigcal();
		notebook.movigcal();
		notebook.movigcal();
		notebook.movigcal();
		notebook.movigcal();
		notebook.movigcal();
		notebook.movigcal();

		System.out.println("===ISE-1234펜으로 테블릿 사용====");
		tablet.write("ISE-1234");

		System.out.println("===ISE-4321펜으로 테블릿 사용====");
		tablet.write("ISE-4321");
		
		
	}

}




















