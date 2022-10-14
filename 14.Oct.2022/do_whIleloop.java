package Assigment;
import java.util.*;
/* 
Write a do-while loop that asks the user to enter two numbers. 
The numbers should be added and the sum displayed.
The loop should ask the user whether he 
or she wishes to perform the operation again. If so,
the loop should repeat; otherwise it should terminate.       
*/
public class do_whIleloop {  // main method create
	public static void main(String[] args) {  
		  // scanner class
	      Scanner in = new Scanner(System.in);          
	      int sum = 0;
	      char opp;
	      // create a loop
	      do { 
	      System.out.println("Enter two numbers");
	      int num1= in.nextInt();
	      int num2 = in.nextInt();
	      sum = sum+num1+num2;
	      System.out.println("Do you wish to perform another operation, Y/N");    
	      opp =in.next().charAt(0);
	      }
	      while(opp =='Y'||opp=='y');
	      System.out.println("sum "+sum);
	      }}