package AllProgram;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Enter two numbers for addition:");
		a=scan.nextInt();
		b=scan.nextInt();
		c=a+b;
		System.out.println("a+b="+c);
		
		System.out.println("Enter two numbers for subtraction:");
		a=scan.nextInt();
		b=scan.nextInt();
		c=a-b;
		System.out.println("a-b="+c);
		
		System.out.println("Enter two numbers for Division:");
		a=scan.nextInt();
		b=scan.nextInt();
		c=a/b;
		System.out.println("a/b="+c);
		
		System.out.println("Enter two numbers for Multiplication:");
		a=scan.nextInt();
		b=scan.nextInt();
		c=a*b;
		System.out.println("a*b="+c);
		
		System.out.println("Enter two numbers for Modulus:");
		a=scan.nextInt();
		b=scan.nextInt();
		c=a%b;
		System.out.println("a%b="+c);
		
		
		
		
		
		
	}
	

}
