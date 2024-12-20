public class Encapsulate{
	//Variable declared private.
	private String name;
	private int age;
	private int roll;
	
	//Get and Set method declared.
	public String getname(){
	return name;
	}
	public void setname(String name){
	this.name=name;
	}
	public int getage(){
	return age;
	}
	public void setage(int age){
	this.age=age;
	}
	public int getroll(){
	return roll;
	}
	public void setroll(int roll){
	this.roll=roll;
	}
	public static void main(String args[]){
			Encapsulate std=new Encapsulate();
			std.setname("Sarathi");
			std.setage(21);
			std.setroll(5037);
			System.out.println("Student Name:"+std.getname()+
					"\nStudent Age:"+std.getage()+
					"\nStudent Rollno:"+std.getroll());

	}
}