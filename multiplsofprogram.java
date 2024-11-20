import java.util.Scanner;

public class multiplsofprogram {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

  
        if (number % 2 == 0) {
            System.out.println(number + " is a multiple of 2.");
        } else {
            System.out.println(number + " is not a multiple of 2.");
        }

    }
}