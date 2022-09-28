package Assigment;

/*
 Q.1 Java Program to find average of an int Array.
 */
import java.util.Scanner;

public class Arraylist {
	    public static void main(String[] args) {
	        // for taking user input & storing in an array
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter How Many colors you add:");
	        int totalColors = sc.nextInt();
	        String[] array = new String[totalColors];
	        for (int i = 0; i < totalColors; i++) {
	            System.out.println("Enter color " + (i + 1) + " name: ");
	            array[i] = sc.next();
	        }
	        // for printing all values
	        System.out.println("Your color list is: ");
	        for (String i : array) {
	            System.out.println(i);
	        }
	        sc.close();
	    }}