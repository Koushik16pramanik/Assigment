package Oerateor;

import java.util.Scanner;
// Take three numbers from the user and print the greatest number.
public class AssigmentQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y, z;
	    System.out.println("Enter three integers");
	    Scanner in = new Scanner(System.in);

	    x = in.nextInt();
	    y = in.nextInt();
	    z = in.nextInt();

	    if (x > y && x > z)
	      System.out.println("First number is the largest.");
	    else if (y > x && y > z)
	      System.out.println("Second number is the largest.");
	    else if (z > x && z > y)
	      System.out.println("Third number is the largest.");
	    else
	      System.out.println("The numbers are not distinct.");


}}
