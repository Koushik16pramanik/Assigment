package Assigment;
import java.util.*;

// main method
public class Try_CatchSolution {
	public static void main(String[] args) {
		        try {
		        	// take Scanner class
		            Scanner scan = new Scanner(System.in);
		            System.out.println("Enter the values of x and y : ");
		          //taking inputs
		            int x = scan.nextInt();
		            int y = scan.nextInt();
		          //printing the division
		            System.out.println(x/y);
		        } 
		      //use ArithmeticException
		        catch (ArithmeticException AE) {
		            System.out.println(AE);
		        } 
		      //use InputMismatchException
		        catch (InputMismatchException IME) {
		            System.out.println(IME);
		        }}}