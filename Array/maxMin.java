package Assigment;
import java.util.*;

//5.write a JAVA program to find the maximum & minimum value of an array

public class maxMin {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in)	; //scanner class
		System.out.println("how many number you want to store"); //print
		int size=sc.nextInt(); //store the size
		int a[]=new int[size];
		System.out.println("enter the numbers");
		for(int i=0;i<a.length;i++) { //store array number
			a[i]=sc.nextInt();	
		}Arrays.sort(a);
		System.out.println("min is " +a[0]); //print min number
		System.out.println("max is "+a[size-1]); //print max number
	}}