package ex12inheritance;

class Box{
	public void boxWrap() {
		System.out.println("박스로 포장합니다.");
	}
}
class PaperBox extends Box{
	public void paperWrap() {
		System.out.println("paperBox로 포장합니다.");
	}
}
class GoldPaperBox extends PaperBox{
	public void goldWrap() {
		System.out.println("goldPaperBOx로 포장합니다");
	}
}
public class E09InstanceOf {

	static void wrapBox(Box b) {
		
		if (b instanceof GoldPaperBox) {
			((GoldPaperBox) b).goldWrap();
		}
		else if( b instanceof PaperBox) {
			((PaperBox) b).paperWrap();
		}
		else if(b instanceof Box) {
			b.boxWrap();
			
		}
		
		
	}
	public static void main(String[] args) {
		
		Box box = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		
		wrapBox(box);
		wrapBox(box2);
		wrapBox(box3);

//		String str = new String("나는 누구?");
//		wrapBox(str);
	}
}





























