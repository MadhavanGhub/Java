//Write a java program to print the number is the value of square or not


import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sq= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i=sq.nextInt();
		double a= Math.sqrt(i);
		System.out.println(a);
		if(a*a==i){
			System.out.println(i+ " is a perfect square");
		} else {
			System.out.println(i+ " is not a perfect square");
		}

	}

}