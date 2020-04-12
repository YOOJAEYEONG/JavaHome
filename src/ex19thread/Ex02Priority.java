package ex19thread;

class MessageSendingThread extends Thread{
	String message;

	public MessageSendingThread(String message) {
		super();
		this.message = message;
	}
	
	public MessageSendingThread(String message, int priority) {
		super();
		setPriority(priority);
		this.message = message;
	}
	@Override
	public void run() {
		for(int i=1; i <=100; i++) {
			System.out.println(message+i+" "+getPriority());
			try {
				sleep(2);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Ex02Priority {

	public static void main(String[] args) {
		
		MessageSendingThread tr1 =
				new MessageSendingThread("첫번째", Thread.MAX_PRIORITY);
		MessageSendingThread tr2 = 
				new MessageSendingThread("두번째", Thread.NORM_PRIORITY);
		MessageSendingThread tr3 =
				new MessageSendingThread("세번째", Thread.MIN_PRIORITY);
		
		
		tr1.start();
		tr2.start();
		tr3.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
