package Allprogram;

import java.util.Scanner;

public class Task13pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int i,j,r;	
		System.out.print("Input number of rows");
		r=scan.nextInt();
			
		for(i=0;i<r;i++) 
		{
		for(j=r;j>i;j--) 
		System.out.print(j);
		System.out.print("\n");
		}
		
		}
		// TODO Auto-generated method stub

	}


