package ex08class;

class Car{
		//멤버 상수
		public static final String AUTO = "자동";
		public static final String MANUAL = "수동";
		
		//멤버 변수
		String carGear = AUTO;
		String carModel;
		int carYear;
		Human owner;
		
		void drive() {
			System.out.println(owner.name + "이"+ carModel + "을 운전한다.");
		}
		
		void initialize() {
			carModel = "람보르기니";
			carYear = 2017;
			owner = new Human();
			owner.name = "캡틴로져스";
			owner.age = 30;
			owner.energy = 10;
		}
		
		void initialize(String model, int year, String name, int age, int energy) {
			
			carModel = model;
			carYear = year;
			owner = new Human();
			owner.name = name;
			owner.age = age;
			owner.energy = energy;
		}
		
		void showCarInfo() {
			System.out.println("===차량정보===");
			System.out.println("모델명: "+carModel);
			System.out.println("연식: "+ carYear	);
			System.out.println("기어: "+ carGear);
			System.out.println();
			}
}//////////////////////////////////////////

public class CarMain {

	public static void main(String[] args) {

		Car car1 = new Car();
		
		System.out.println("초기화메소드 호출전");
		System.out.println("car1.owner="+car1.owner);//null
		
		//car1.drive();
		
		System.out.println("초기화후 메소드 호출");
		car1.initialize();
		car1.drive();
		car1.showCarInfo();
		
		Car car2 = new Car();
		
		car2.carGear = Car.MANUAL;
		car2.carModel = "bentley";
		car2.carYear = 2018;
		
		car2.owner = new Human();
		car2.owner.name = "스타크";
		car2.owner.age = 52;
		car2.owner.energy = 8;
		
		System.out.println("자동차 정보와 소유자 정보 같이 보기");
		car2.showCarInfo();
		
		Car car3 = new Car();
		car3.initialize("sport car", 2012, "성유겸", 8, 10);
		car3.showCarInfo();
		
		
		
		
		
	}

}






















