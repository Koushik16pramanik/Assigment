package Assigment;
import java.util.*;

/*
 Java program to find duplicate elements in an String array.
 */
public class Duplicateelement {

	public static void main(String args[]) { // main method create 
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter the number of elements in the array: "); 
        int num = sc.nextInt(); 
        String arr[] = new String[num];             // creating object
        System.out.println("Enter the elements: ");
        //  create a loop 
        for (int i = 0; i <arr.length; i++) {        
            arr[i] = sc.next(); 
        }
        // Using the array
        System.out.print("Array: ");
        printArray(arr);
        System.out.print("The duplicate elements are : ");
                                               // Print non duplicate elements
        printDupes(arr);
    	}
                                                        // Function to print the array
    static void printArray(String arr[]) {
        for(int i = 0; i < arr.length ; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    	}
    public static void printDupes(String arr[]) {  
        
    	int j = 0;                                                // Checks for duplicate elements
        for (int i=0; i<arr.length-1; i++) {
            for(j=i+1;j<arr.length;j++)
                if (arr[i].equals(arr[j])&&i!=j) {
                    System.out.print(arr[j]+" "); 
         }}}}