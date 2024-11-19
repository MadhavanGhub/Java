//public class Main{
//           public static void main(String[] args){
//           String name="boat";
//           int a=500;
//           int b=600;
//           int c=700;
//           System.out.println("a=> "+a +"\n"+"b=>"+b+"\n"+"c=>"+c);           
//           
//           
//}
//}


// 1
import java.util.Scanner;

public class Main{
           public static void main(String[] args){
        	   
        	   // 1
        	    System.out.println("1. 10, 20, 30, ..., 100");
        	    System.out.println("***********************");
        	   int number = 10;
        	   while(number<=100) {
        		   System.out.print(number+", ");
        		   number+=10;
        	   }
        	       
        	   // 2
        	    System.out.println(" ");
        	    System.out.println("2. Odd or Even");
        	    System.out.println("***************");
        	   Scanner scanner = new Scanner(System.in);
        	   System.out.print("Please enter a number: ");
        	   int limit = scanner.nextInt();
        	   System.out.print("Odd Numbers: ");
        	   for(int i=1;i<=limit;i++) {
        		   if(i%2!=0) 
        			   System.out.print(i+", ");
        	   }
        	   System.out.println("");
        	   System.out.print("Even Numbers: ");
        	   for(int i=1;i<=limit;i++) {
        		   if(i%2==0)
        			   System.out.print(i+", ");
        	   }

        	   // 3
        	   
        	    System.out.println(" ");
        	    System.out.println("3. Table");
        	           System.out.print("Enter a number (1 to 10): ");
        	           int number1 = scanner.nextInt();

        	           if (number1 < 1 || number1 > 10) {
        	               System.out.println("Please enter a number between 1 and 10.");
        	           } else {
        	               System.out.println("Table of " + number1 + ":");
        	               for (int i = 1; i <= 10; i++) {
        	                   System.out.println(number1 + " x " + i + " = " + (number1 * i));
        	               }
        	           }
        	       
        	       
        	   
        	   //4
        	   //amstrong number
        	   
        	           System.out.println(" ");
        	           System.out.println("4. Amstrong number ");
        	           System.out.println("********************");
        	           System.out.print("Enter a number: ");
        	           int number11 = scanner.nextInt();
        	           int originalNumber = number11;
        	           int result = 0;

        	           while (number11 != 0) {
        	               int digit = number11 % 10;
        	               result += Math.pow(digit, 3); // Assuming 3-digit number
        	               number11 /= 10;
        	           }

        	           if (result == originalNumber) {
        	               System.out.println(originalNumber + " is an Armstrong number.");
        	           } else {
        	               System.out.println(originalNumber + " is not an Armstrong number.");
        	           }
        	        
        	   //5
        	   //leap year program
        	   
        	  
        	           System.out.println(" ");
        	           System.out.println("5. Leap year program");
        	           System.out.print("Enter a year: ");
        	           int year = scanner.nextInt();

        	           if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        	               System.out.println(year + " is a leap year.");
        	           } else {
        	               System.out.println(year + " is not a leap year.");
        	           }
        	           scanner.close();
        	   
        	   

           }
}
