package ex12inheritance;

public class AnimalMain {
	public static void main(String[] args) {
		
		AnimalDog ag = new AnimalDog("포유류", "수컷", 2, "포메라니안", "포미");
		
		ag.showAnimal();
		
		ag.bark();
		
		ag.showDog();
	}
}
/*
종은:포유류
나이는:2
성별은:수컷
====================
이름이 뽀미이고 종이 포유류인 강아지가 짖는다
====================
종은:포유류
나이는:2
성별은:수컷
종류는:포매라니안
이름은:뽀미
*/