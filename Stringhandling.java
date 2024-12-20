package Allprogram;

public class Stringhandling {

	public static void main(String[] args) {
		
		String s= "Sachin";
		
		System.out.println(s.toUpperCase()); // Change every char to upper case
		
		System.out.println(s.toLowerCase()); // change every char to lower case
		
		System.out.println(s.trim()); //remove whitespace before and after the string
		
		System.out.println(s.startsWith("Sa")); //true ( indicates whether true or false)
		
		System.out.println(s.endsWith("n")); // true ( indicates whether true or false)
		
		System.out.println(s.charAt(0)); // S return the character at the particular index(0).
		
		System.out.println(s.charAt(3)); // H return the character at the particular index(3).
		
		String s1 = new String("Sachin"); 
		
		String s3=s1.intern();// converting the string object s1 into s3 using intern() i.e copying string object to other.
		
		System.out.println(s3);
		
		String s99="Java is a programming language";
		
		String str12=s1.concat(s99);
		
		String s20="Hello";
		
		String s21="Java";
		
		String s23="How are you";
		
		String str18=s20.concat(s21).concat(s23);
		
		int a=10;
		
		String s4=String.valueOf(a);
		
		System.out.println(s4+10);
		
		String a1="Hello"+"Java";
		
		System.out.println(a1);
		
		System.out.println(s20.equals(s21));
		
	}
}