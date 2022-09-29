package Assigment;

//1.write a java program to find the index of an array element

public class arrayIndex {
	public static void main(String[] args) {
		 int[] numbers = {14, 9, 76 , 39 , 2 , 80}; 
	        int element = 2;
	        int index = 0; 
	        int i = 0;
	        while(i < numbers.length) {
	            if(numbers[i] == element) {
	                index = i;
	                break;
	            }
	            i++;
	        }
	        System.out.println("Index of "+element+" is : "+index);
	    }}