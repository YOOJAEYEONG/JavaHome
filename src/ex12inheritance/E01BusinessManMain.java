package ex12inheritance;


class Man{
	
	private String name;
	
	public Man(String name) {
		this.name = name;
		System.out.println("Man 클래스 인자 생성자 호출됨");
	}
	public Man() {
		System.out.println("Man클래스 디폴트 생성자 호출됨");
	}
	
	public void tellYourName() {
		System.out.println("내이름은 " + name + " 입니다.");
	}
	
	
}

class BusinessMan extends Man{
	
	private String company;
	private String position;
	
	
	public BusinessMan(String name, String company, String position) {
		super(name);
		
		this.company = company;
		this.position = position;
		System.out.println("BusinessMan 생성자호출");
	}
	public void tellYourInfo() {
		System.out.println("company is" + company );
		System.out.println("position is "+ position);
		tellYourName();
	}
	
}
public class E01BusinessManMain
{

	public static void main(String[] args)
	{
		BusinessMan man1 = new BusinessMan("김완용", "국세청", "팀장");
		BusinessMan man2 = new BusinessMan("엄석대", "노동청", "과장");
		
		man1.tellYourInfo();
		man1.tellYourName();
		
		man2.tellYourInfo();
		man2.tellYourName();
		
	}

}
