package Allprogram;

import java.util.Scanner;

public class FullDiamondHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,r;
System.out.println("Input number of rows half of the diamond");
Scanner in=new Scanner(System.in);
r=in.nextInt();
//i-row(r),j-column
for(i=0;i<=r;i++)
{
	for(j=1;j<r-i;j++)
		System.out.print(" ");
	for(j=1;j<=2*i-1;j++)
		System.out.print("*");
	System.out.print (" \n");
}
for(i=r-1;i>=1;i--)
{
	for(j=1;j<=r-i;j++)
		System.out.print(" ");
	for(j=1;j<=2*i-1;j++)
		System.out.print("*");
	System.out.print ("\n");
}

	}

}