package Allprogram;

//deadlock for 2 generated methods hut lock on objects
//caller1 & caller2 forcing to wait for each other to unlock such locks. This would trigger and prevent callMe() function from being called.
//Synchronized---> synchronized is a keyword is used to mark block of code or method as synchronized which means that only one thread can execute it at a time. 
//ex: if you remove a synchronized keyword from a method another thread may modifies the values of variables in between the operations which could change the total amount between the variables.
public class ThreadDeadlock {
	private final String name;
	public ThreadDeadlock(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public synchronized void call(ThreadDeadlock caller) {
		System.out.println(this.getName()+"Has asked to call me"+caller.getName());
		try {
			Thread.sleep(1000);
			}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		caller.call(this);
	}
	public static void main(String[] args) {
			  
		ThreadDeadlock caller1 = new ThreadDeadlock("caller-1");
		ThreadDeadlock caller2 = new ThreadDeadlock("caller-2");
		
		new Thread(new Runnable() {
			public void run() {
				caller1.call(caller2);
			}}).start();
		new Thread(new Runnable() {
			public void run() {
				caller2.call(caller1);
			}
		}).start();
		}
	}