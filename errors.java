// File: Errors.java
// Purpose: A program with lots of syntax errors
// Correct all of the errors (STUDY the program carefully!!)
import java.util.Scanner;
public class errors
{
 public static void main (String[] args)
 {
   String name; // Name of the user
   int number;
   int numSq;
   Scanner scan = new Scanner(System.in);
   System.out.print ("Enter your name, please: ");
   name = scan.nextLine();
   System.out.print ("What is your favorite number?");
   number = scan.nextInt();
   numSq = number * number;
   System.out.println (name + ", the square of your number is " + numSq);
  }
}