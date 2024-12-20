package Allprogram;

public class Threadprirority1 extends Thread{

	public void run() {
		System.out.println("Running Thread Priority"+Thread.currentThread()+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		
		Threadprirority1 m1 = new Threadprirority1();
		Threadprirority1 m2 = new Threadprirority1();
		
		m1.setPriority(Thread.MAX_PRIORITY);
		m2.setPriority(Thread.MIN_PRIORITY);
		
		m1.start();
		m2.start();
	}

}