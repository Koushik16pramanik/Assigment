package Assigment;

import java.util.*;

/*
 2. Write a Java program to create a new array
  list of elements, add some colors (string) and 
  print out the collection.
 */

public class Averageofarray {
    public static void main(String[] args) {
        // for taking user input & storing in an array
        
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int arrayLength = sc.nextInt();
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter index " + (i + 1) + " : ");
            numbers[i] = sc.nextInt();
        }
        // for calculating & printing Avg
        
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        int average = sum / numbers.length;
        System.out.println("Average is : " + average);
        sc.close();
    }}