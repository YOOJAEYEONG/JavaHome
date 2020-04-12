package ex12inheritance;


class Gun{
	
	int bullet;

	public Gun(int bullet) {
		this.bullet = bullet;
	}
	
	public void shotGun() {
		System.out.println("빵야빵야");
		bullet--;
	}
	
}
class Police{
	
	int handCuffs;                                                   
	Gun gun;

	
	public Police(int handCuffs, int bullet) {
		this.handCuffs = handCuffs;
		if(bullet <= 0) {
			gun = null;
		}
		else {
			gun = new Gun(bullet);
		}
	}
	
	public void putHandCuff() {
		System.out.println("수갑을채웠다");
		handCuffs--;
	}
	
	public void shot() {
		if(gun == null) {
			System.out.println("보유한 권총이 없음");
		}
		else {
			gun.shotGun();
		}
	}
	
}
public class E05HasAComposite {

	public static void main(String[] args) {

		System.out.println("경찰1 =====");
		
		Police police1 = new Police(5, 3);
		police1.shot();
		police1.putHandCuff();
		
		System.out.println("경찰2=======");
		Police police2 = new Police(0, 3);
		police2.shot();
		police2.putHandCuff();
	}

}























