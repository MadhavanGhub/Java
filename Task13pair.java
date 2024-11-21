package Allprogram;

import java.util.Scanner;

public class Task13pair {

	  enum actress{Trisha,Asin,Samantha}

	  public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the actress name:");
		String input=scan.nextLine();
		actress paired=actress.valueOf(input);
		switch(input)
		{
		case "Trisha":
		        System.out.println("Ghilli");
		        System.out.println("Krieedam");
		        System.out.println("Leo");
		        System.out.println("Aadhi");
		        System.out.println("Enter a movie name to find the actor paired with: ");
		        String A1=scan.nextLine();
		        switch(A1)
		        {
		        case "Ghilli","Leo","Aadhi":
		                System.out.println("Vijay is the pair of Trisha");
		                break;
		        case "Krieedam":
		                System.out.println("Ajith is the pair of Trisha");
		                break;
		        }break;
		case "Asin":
		        System.out.println("Sivakasi");
		        System.out.println("Ghajini");
		        System.out.println("Aalwar");
		        System.out.println("Enter a movie name to find the actor paired with: ");
		        String A2=scan.nextLine();
		        switch(A2)
		        {
		        case "Sivakasi":
		                        System.out.println("Vijay is the pair of Asin");
		                break;
		        case "Ghajini":
		                System.out.println("Surya is the pair of Asin");
		                break;
		        case "Aalwar":
		        	System.out.println("Ajith is the pair of Asin");
		        }break;
		case "Samantha":
		        System.out.println("Kaththi");
		        System.out.println("Anjaan");
		        System.out.println("Mersal");
		        System.out.println("Enter a movie name to find the actor paired with: ");
		        String A3=scan.nextLine();
		        switch(A3)
		        {
		        case "Kaththi","Mersal":
		                        System.out.println("Vijay is the pair of Samantha");
		                break;
		        case "Anjaan":
		                System.out.println("Surya is the pair of Samantha");
		                break;
		        case "Nanum Rowdy Than":
		                System.out.println("Vijay Sethupathi is the pair of Nayanthara");
		                break;
		        }break;
		}
		        }

		

	}