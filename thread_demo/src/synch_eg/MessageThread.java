package synch_eg;

public class MessageThread implements Runnable {
	
	private String message1;
	private String message2;

	public MessageThread(String message1, String message2) {
		super();
		this.message1 = message1;
		this.message2 = message2;
		
		// inside constructor, you must make the thread
		Thread t=new Thread(this);
		t.start();
	}



	@Override
	public void run() {

		Printer.printMessages(message1, message2);
		
	}
	
	

}
