package Allprogram;

public class RelationalLogical1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=15;
		System.out.println("Relational operator");
		System.out.println("a equals to b: "+(a==b));
		System.out.println("a not equal to b: "+(a!=b));
		System.out.println("a greater than b: "+(a>b));
		System.out.println("a less than b: "+(a<b));
		System.out.println("a greater than or equal to b: "+(a>=b));
		System.out.println("a lesser than equal to b: "+(a<=b));

		System.out.println("Logical operator");
		System.out.println("&& "+((a<b) &&(a==b)));// both cond should true
		System.out.println("|| "+((a>b) ||(a!= b)));//any one cond should be true
		System.out.println("!= "+((a<b) != (a!= b)));//True means false /false means true


	}

}