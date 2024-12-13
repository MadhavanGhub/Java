//12/12/2024

// Array of object is used to store multiple instance of class within a single array
//this allows us to
package AllProgram;
class Student{
	public int id;
	public String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void display()
	{
		System.out.println("Student id is "+id+" "+"name is "+name);
	}
}
public class ArrayofObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr=new Student[3];
		arr[0]=new Student(100,"Malar");
		arr[1]=new Student(101,"Arun");
		arr[2]=new Student(102,"Prakash");
		System.out.println("Student data arr0:");
		arr[0].display();
		System.out.println("Student data arr1:");
		arr[1].display();
		System.out.println("Student data arr2:");
		arr[2].display();
	}

}