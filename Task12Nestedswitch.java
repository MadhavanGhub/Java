package Allprogram;

import java.util.Scanner;

public class Task12Nestedswitch {

	public static void main(String[] args) {

		String actors,inp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Actor name on the below list");
		System.out.println("vijay || rajini || kamal");
		actors=scan.nextLine();
		
		switch(actors) {
		case "vijay":
			System.out.println("You want hit movies or flop movies list");
			inp=scan.nextLine();
			
			switch(inp) {
			case "hit":
				System.out.println("Ghilli");
				System.out.println("Thupakki");
				System.out.println("Mersal");
				break;
			case "flop":
				System.out.println("Sura");
				System.out.println("Bhairava");
				System.out.println("Puli");
				break;
			}
			break;
		case "rajini":
			System.out.println("You want hit movies or flop movies list");
				inp=scan.nextLine();
			
			switch(inp) {
			case "hit":
				System.out.println("Baasha");
				System.out.println("Padayappa");
				System.out.println("Jailer");
				break;
			case "flop":
				System.out.println("Linga");
				System.out.println("Kochadaiyan");
				System.out.println("2.0");
				break;
		}
			break;
		case "kamal":
			System.out.println("You want hit movies or flop movies list");
			inp=scan.nextLine();
			
			switch(inp) {
			case "hit":
				System.out.println("Virumandi");
				System.out.println("Vishwaroopam");
				System.out.println("Vikram");
				break;
			case "flop":
				System.out.println("Thoongavanam");
				System.out.println("uthama villan (also considered as good movie)");
				System.out.println("Mumbai Express");	
				break;
		}
			break;
}
	}
}