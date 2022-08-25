//write a java program to cheak a year leap year or not.
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scan.nextInt();
         {
        do {
            if (year % 4==0) {
                 System.out.println(year + " is a leap year"); 
                }
             else {
                 System.out.println(year + " is not a leap year");
             }
        }
        
        while(year % 4==0); 

    }

}}
