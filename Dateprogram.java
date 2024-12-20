package Allprogram;

import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
public class Dateprogram {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd//MM//yyyy");
		Scanner input=new Scanner(System.in);
		
		String format=input.nextLine();
		
		LocalDate date=LocalDate.parse(format,dtf);
	
        LocalDate newDate = date.plusDays(4).plusMonths(4).plusYears(4);


        System.out.println("Original date: " + date);
        System.out.println("New date after adding 4 days, 4 months, and 4 years: " + newDate);
		

	}

}
