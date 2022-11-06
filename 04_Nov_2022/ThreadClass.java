package Assigment;
 // Q.1  Write a thread to print the thread name with a 2 sec delay with main thread

public class ThreadClass {   // using thread class
	public static void main(String args[]) {
		System.out.println("Ram");
			try {
		Thread.sleep(200); 
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Shyam");
			}}
