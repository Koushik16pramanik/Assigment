package Assigment;
import java.util.*;

//2.write a JAVA program to remove a specific element from an array

public class Arreyremoveelement {
	public static void main(String[] args) {
		  //create an array 
		 int[] n = {14, 9, 76 , 39 , 2 , 80}; 
      System.out.println("Original Array size : "+ n.length );
      System.out.println("Contents : " + Arrays.toString(n)); 
    //remove or delete an element from an Array
      int removeIndex=1; //remove 2nd element from an array
     for(int i=removeIndex;i<n.length-1;i++) {
  	   n[i]=n[i+1];
     }
      // Size of an array must be 1 less than the original array
      // after deleting an element
      System.out.println("Content of Array after removing an object : " + Arrays.toString(n)); 
  }}