package aaplication;


import java.util.Locale;
import java.util.Scanner;

import entities.Logic;


public class Program {
     public static void main (String[]  args) {
    	 
    	 Locale.setDefault(Locale.US);
    	 Scanner sc = new Scanner(System.in);
    	 
    	 Logic lg = new Logic();
    	 
    	System.out.println("Enter rectangle width:");
        lg.width = sc.nextDouble();
          
    	System.out.println("Enter rectangle height: ");
    	lg.height = sc.nextDouble();
    	
    	System.out.printf("Area: %.2f%n", lg.area());
    	System.out.printf("Perimeter: %.2f%n ", lg.perimeter());
    	System.out.printf("Diagonal: %.2f%n", lg.diagonal());
    	 
    	 
    	 
    	 sc.close();
     }
	
}
