package Assigment;
import java.util.*;

//7.write a JAVA program to find the duplicate values of an array

public class Arrayduplicatevalue {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in)	; //scanner class
			System.out.println("how many number you want to store"); //print
			int size=sc.nextInt(); //store the size
			int a[]=new int[size]; 
			System.out.println("enter the numbers"); //print
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
				}
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<size;j++) {
			if(a[i]==a[j]) {
				System.out.println("Duplicate element is : "+a[j]);
			}}}}}