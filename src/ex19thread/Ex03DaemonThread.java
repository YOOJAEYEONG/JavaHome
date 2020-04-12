package ex19thread;

class NotThread{
	String title;

	public NotThread(String title) {
		super();
		this.title = title;
	}
	
	void NotThreadMethod() {
		for(int i=1; i<=10 ; i++) {
			System.out.println(String.format("%s] i= %d", title, i));
		}
	}
}


class YesThread extends Thread{

	public YesThread() {}
	
	public YesThread(String threadName) {
		super(threadName);
	}
	void threadMethod() throws InterruptedException{
		for(int i=1; i<=10 ; i++) {
			System.out.println(String.format("메인 종료후 계속 실행되는독립%s] i= %d", getName(), i));
		}
		sleep(3000);
	}
	
	@Override
	public void run() {
		try {
			threadMethod();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}

class DaemonThread extends Thread{
	
	@Override
	public void run() {
		while(true) {
			System.out.println(String.format("쓰레드명:%s ", getName()));
			try {
				sleep(3000);
				System.out.println("메인과 같이 종료되는 데몬쓰레드");
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("자동저장시 오류발생");
			}
		}
	}
}
public class Ex03DaemonThread {

	public static void main(String[] args) {
		
		NotThread nt1 = new NotThread("첫번째클래스");
		NotThread nt2 = new NotThread("두번째클래스");
		
		nt1.NotThreadMethod();
		nt2.NotThreadMethod();
		
		YesThread yt1 = new YesThread("1쓰레드");
		YesThread yt2 = new YesThread("2쓰레드");
		
		yt1.start();
		yt2.start();
		
		DaemonThread dt1 = new DaemonThread();
		dt1.setName("데몬의 첫번째 쓰레드");
		dt1.setDaemon(true);
		dt1.start();
		
		DaemonThread dt2 = new DaemonThread();
		dt2.setName("데몬의 두번째 쓰레드");
		dt2.setDaemon(true);
		dt2.start();
		
		
		System.out.println("===================");
		System.out.println("###현재 활성화 상태의 쓰레드 수: "+ Thread.activeCount());
		System.out.println("###현재 실행중인 쓰레드 : "+ Thread.currentThread());
		System.out.println("###메인삼수의 우선순위: "
				+Thread.currentThread().getPriority());
		System.out.println("###메인메소드 종료");
	}
}
