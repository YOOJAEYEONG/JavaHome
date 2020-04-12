package ex12inheritance;

public class DeParent {

	
	private String name;
	private int age;
	
	public DeParent() {}
	
	public DeParent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	private void eat() {
		System.out.println("부모님이 드신다");
	}
	String sleep() {
		System.out.println("부모님이 주무심");
		 return null;
	}
	protected void walk() {
		System.out.println("부모님이 걷는다");
	}
	public void exercise() {
		System.out.println("부모님이 운동");
	}
	
	public void printParent() {
		System.out.printf("name : %s, age ; %d	", name, age);
	}
	
	public static void staticMethod() {
		System.out.println("부모님의 정적메소드");
	}
	
	
}
