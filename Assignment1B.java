/*
Name: Ahmad Alkurdy
Date: 2/7/2017
Purpose: Write an application that inputs one number consisting of five digits 
from the user, separates the number into its individual digits and prints the 
digits separated from one another by three spaces each. For example, if the
user types in the number 42339, the program should print “4 2 3 3 9.” Assume that the user enters
the correct number of digits.

 */
package assignment1b;
import java.util.Scanner;
/**
 *
 * @author ahmad
 */
public class Assignment1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating scanner for reading data from the user
        Scanner input = new Scanner(System.in);
        //declaring variables to hold the five digit number and the five digits
        int number;
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        //prompt the user 
        System.out.print("Enter a five digit number: ");
        number= input.nextInt();
        //arithmatic calculation using the mod and division
        num1 = number/10000;
        num2 = (number%10000)/1000;
        num3 = (number%10000%1000)/100;
        num4 = (number%10000%1000%100)/10;
        num5 = number%10000%1000%100%10;
        
        //output the results
        System.out.printf("Digits in %d are ",number);
        System.out.println(num1+"   "+num2+ "   "+num3+"   "+num4+"   "+num5);
                
        
        
    }
    
}
