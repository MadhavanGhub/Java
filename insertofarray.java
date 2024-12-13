//12/12/24

package AllProgram;

import java.util.Scanner;

public class InsertArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,pos,x;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of elements you want in array:");
		n=s.nextInt();
		//Array initialization
		int a[]=new int[n+1];
		System.out.println("Enter all the elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the position where you want to insert:");
		pos=s.nextInt();
		System.out.println("Enter the element you want to insert:");
		x=s.nextInt();
		for(int i=(n-1);i>=(pos-1);i--)
		{
			a[i+1]=a[i];
		}
		a[pos-1]=x;
		System.out.println("After inserting:");
		for(int i = 0;i<n;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println(a[n]);

	}

}