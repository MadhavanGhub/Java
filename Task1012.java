//Task10/12/2024
//The class Encapsulate is encapsulated as the variables are declared private.
//The get methods like getAge(), getName(), and getRoll() are set as public,
//these methods are used to access these variables. The setter methods like
//setName(), setAge(), setRoll() are also declared as public and are
//used to set the values of the variables.  
package Allprogram;		
class Encapsulate
{
	private String Name;
	public String getName() {
		return Name;
	}
	private int Age;
	public int getAge() {
		return Age;
	}
	private int Rollno;
	public int getRollno() {
		return Rollno;
	}
	public void  setName(String Name) {
		this.Name=Name;
	}
	public void setAge(int Age) {
		this.Age=Age;
	}
	public void setRollno(int Rollno) {
		this.Rollno=Rollno;
	}
}

public class Task1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulate obj1=new Encapsulate();
		System.out.println("Student Details:");
		obj1.setName("Saran");
		obj1.setAge(23);
		obj1.setRollno(123);
		System.out.println("Name:"+obj1.getName()+"\n"+"Age:"+obj1.getAge()+"\n"+"Rollno:"+obj1.getRollno());
		System.out.println();
		Encapsulate obj2=new Encapsulate();
		obj2.setName("Madhavan");
		obj2.setAge(23);
		obj2.setRollno(124);
		System.out.println("Name:"+obj2.getName()+"\n"+"Age:"+obj2.getAge()+"\n"+"Rollno:"+obj2.getRollno());
		
	}

}