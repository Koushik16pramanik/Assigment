package Assigment;

import java.util.*;

/*
 Q.3 Write a Java Program to reverse the array contents.
 */

public class Reverseanarray {
	    public static void main(String[] args) {
	        // for taking user input & storing in an array
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the length: ");
	        int arrayLength = sc.nextInt();
	        int[] arr = new int[arrayLength];
	        for (int i = 0; i < arrayLength; i++) {
	            System.out.println("Enter index " + (i + 1) + " : ");
	            arr[i] = sc.nextInt();
	        }
	        int length = arr.length;
	        int[] revArray = reverseArray(arr, 0, length - 1);
	        // loop for display array content.
	        for (int i : revArray)
	            System.out.print(i + " ");
	        sc.close();
	    }
	    public static int[] reverseArray(int[] a, int i, int j) {
	        if (i < j) {
	            // swap elements
	            int temp = a[i];
	            a[i] = a[j]; a[j] = temp;
	            reverseArray(a, i + 1, j - 1);
	        }
	        return a;
	    }}