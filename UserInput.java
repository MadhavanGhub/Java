package AllProgram;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner obj1 = new Scanner(System.in);
		
		System.out.println("Enter the name:");
		String name=obj1.nextLine();
		
		System.out.println("Enter the age");
		int age=obj1.nextInt();
		
		System.out.println("Enter the salary:");
		double salary=obj1.nextDouble();
		
		System.out.println("Enter a float value:");
		float f=obj1.nextFloat();
		
		System.out.println("Enter a short value");
		short s=obj1.nextShort();
		
		System.out.println("enter a byte value");
		byte b=obj1.nextByte();
		
		System.out.println("enter a Long value");
		long l1=obj1.nextLong();
		
		System.out.println("Are you 18 years old (true or false)");
		boolean bn=obj1.nextBoolean();
		
		System.out.println("Name :"+name);
		System.out.println("age :"+age);
		System.out.println("salary :"+salary);
		System.out.println("Float value:"+f);
		System.out.println("Short value:"+s);
		System.out.println("Byte value:"+b);
		System.out.println("Long value:"+l1);
		System.out.println("Are you 18 years old:"+bn);

	}

}
