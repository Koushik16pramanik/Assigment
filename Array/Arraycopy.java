package Assigment;

import java.util.*;

//3.write a JAVA program to copy of an array by iterating the array

public class Arraycopy {
	public static void main(String[] args) {
		   int Size, i;
	        Scanner sc = new Scanner(System.in); //scanner class
	        System.out.print(" Enter Number of elements in an array : ");
	        Size = sc.nextInt(); //store the size
	        int[] arr1 = new int[Size];
	        int[] arr2 = new int[Size];
	        for (i = 0; i < Size; i++) { //storing elements in arr1[]
	         System.out.print("Enter Element no "+(i+1)+" :");
	            arr1[i] = sc.nextInt();
	        }
	        for (i = 0; i < Size; i++) {   //copy elements
	            arr2[i] = arr1[i];
	        }
	        System.out.println("\n Elements in arr2[] after copying: ");
	        for (i = 0; i < Size; i++) {  //storing elements in arr2[]
	            System.out.print( arr2[i]+" , ");
	        }}}