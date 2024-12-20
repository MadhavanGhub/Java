package Allprogram;

public class Threadrunnable implements Runnable {

	public void run() {
	
	System.out.println("Thread is running successfully");
}
	public static void main(String[] args) {
		
		Runnable r1 = new Threadrunnable();
		Thread t1 = new Thread(r1,"MyThread");
		t1.start();
		String str = t1.getName();
		System.out.println(str);
	}
}