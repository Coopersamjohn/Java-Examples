package extending_thread;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		//System.out.println(Thread.currentThread()+"id = "+Thread.currentThread().getId());
		
		for (int i=0; i<3; i++) {
			
			System.out.println("Printing from "+Thread.currentThread().getName()+"value of i = "+i+"\nThread Group Name -- "+ Thread.currentThread().getName());
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
		}
		
	}
	
}
