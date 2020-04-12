package ex19thread;


class ShowThread extends Thread{
	String threadName;
	
	public ShowThread(String threadName) {
		this.threadName = threadName;
	}
	@Override
	public void run() {
		for(int i=1; i<=50; i++) {
			System.out.println("안녕하세요 "+threadName+" 입니다.");
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Ex01ThreadStart {

	public static void main(String[] args) {

		ShowThread st1 = new ShowThread("쓰레드1");
		ShowThread st2 = new ShowThread("쓰레드2");
		st1.start();
		st2.start();
		
	}

}
