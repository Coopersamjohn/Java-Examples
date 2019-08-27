package synch_eg;

public class Printer {

	public static synchronized void printMessages(String message1, String message2) {
		System.out.println(message1);
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("  "+message2);
	}
	
}

// wait notify notifyAll() - producer/consumer problem
// why are these methods in Object class?
