//Q.3 Take three numbers from the user and print the greatest number.
import java.util.Scanner;
public class GreatestNumber {
 public static void main(String[] args) {
	  Scanner ps = new Scanner(System.in);
	   
	  System.out.print("Input the 1st number: ");
	  int a = ps.nextInt();
	   
	  System.out.print("Input the 2nd number: ");
	  int b = ps.nextInt();
	   
	  System.out.print("Input the 3rd number: ");
	  int c = ps.nextInt();
	   
	   
	  if (a > b)
	   if (a > c)
	    System.out.println("The greatest: " + a);
	   
	  if (b > a)
	   if (b > c)
	    System.out.println("The greatest: " + b);
	   
	  if (c > a)
	   if (c > b)
	    System.out.println("The greatest: " + c);
	 }
	}
