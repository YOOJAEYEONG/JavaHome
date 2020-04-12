package ex14innerclass;

class Person{
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	void printInfo() {
		System.out.println(String.format("이름:%s", name));
	}
}
class Student extends Person{
	
	String stNumber;
	public Student(String name, String stNumber) {
		super(name);
		this.stNumber = stNumber;
	}
	
	
	String getInfo() {
		return String.format("학번%s", stNumber);
	}
	
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println(getInfo());
	}
	
}



public class E03AnonymousClass {
	public static void main(String[] args) {
		
		
		Person person = new Student("문사람", "2019");
		
		person.printInfo();
		((Student)person).stNumber = "2020";
		System.out.println(((Student)person).getInfo());
		
		Person anonyPerson = new Person("이발년") {
			int newVar;
			void newMethod() {
				System.out.println("익명클래스에서 새롭게 확장한 메소드");
				
			}
			@Override
			void printInfo() {
				System.out.println("newVar="+newVar);
				newMethod();
				System.out.println("익명클래스에서 오버라이딩");
			}
		};
		anonyPerson.printInfo();
		Student anonyStudent = new Student("이름없음", "9999") {
			
			int age = 1;
			
			String getInfo() {
				return super.getInfo()+", 나이:"+age;
			}
			
			
			void printInfo() {
				System.out.println("이름: " + name + ", "+ getInfo());
			}
		};
		System.out.println("Student클래스를 상속받은 익명클래스");
		anonyStudent.printInfo();
		
	}
}

abstract class AbstractClass{
	abstract void abstractMethod();
}
interface Interface{
	void abstractMethod();
}













