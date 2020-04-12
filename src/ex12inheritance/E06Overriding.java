package ex12inheritance;


class Speaker{
	
	private int volumeRate;
	
	//setter Method
	public void setVolume(int vol) {
		volumeRate = vol;
	}
	
	public void showState() {
		System.out.println("스피커의 볼륨크기 : " + volumeRate);
	}
}

class BaseSpeaker extends Speaker{
	
	private int baseRate;
	public void setBase(int bas) {
		baseRate = bas;
	}
	
	@Override
	public void showState() {
		super.showState();/////////////////////////////////////////
		System.out.println("베이스의 볼륨 : " + baseRate);
	}
	
}
public class E06Overriding {
	
	public static void main(String[] args) {
	
		BaseSpeaker baseSpeaker = new BaseSpeaker();
		baseSpeaker.setVolume(10);
		baseSpeaker.showState();
		baseSpeaker.setBase(20);
		baseSpeaker.showState();
	}
}






















