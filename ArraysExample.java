package Allprogram;

public class ArraysExample {
	void display() {
	//type 1 
	int[] arr = new int[] {1,2,3,4};
	System.out.println(arr);
	//type 2 shorthand
	int[] myArray = {0,9};
	//type 3 (no change in functionality but no on size)
	int mya[]= {98,89};
	//type 4 (initialize the size of the array value)---> used to initialize the size only. 
	int mya1[]=new int[4];
}
	public static void main(String[] args) {
		int[] myArray = {0,9,1,4,6,7};
		for(int i=0;i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}
	}
}