//Thread is a execution unit in the process that has its own program counter,stats as well ass
//registers.Each and every thread belongs to one single process
//Two ways to create a thread
//1.extends threads(class)
//2.implements runnable(interface)
//Thread -- process(init(),start(),stop(),service--run(),destroy(),sleep(),wait(),notify(),notifyall()
//Thread based on task(time bound)---sleep(ms),wait(),await()uhgoygyoiogbgyobguofygot7oju8
//Life cycle of thread
//1.new(constructing)//starting the thread by initializing the obj in the class(extends)
//2.Runnable(prepared to execute the code in interface)
//3.Running(thread for execution with/without time slot)
//4.Blocked(in active)
//5.Dead/terminated(thread exit at the run() process)

//Thread Priorities(based on the scenario)
//1-lowest(Thread.Min_Priority)
//5-standard(Thread.Norm_Priority)
//10-highest(Thread.Max_Priority)


package Allprogram;

public class Threadprogram extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadprogram tp=new Threadprogram();//Thread Initialization
		tp.start();//thread start
		System.out.println("The code is outside the thread");
	}
	public void run()
	{
		System.out.println("The code is running in the thread");

	}

}