package Assigment;
import java.util.*;

//Q.6 write a JAVA program to find the 2nd smallest element of an array

public class Array2ndsmallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in)	; //scanner class
		System.out.println("how many number you want to store"); //print
		int size=sc.nextInt(); //store the size
		int a[]=new int[size];
		System.out.println("enter the numbers");
      for(int i=0;i<a.length;i++) { //array number store
		a[i]=sc.nextInt();	
		}
      Arrays.sort(a);
		System.out.println("2nd smallest element is " +a[1]); //print 
	}}