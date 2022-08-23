package Oerateor;

import java.util.Scanner;
 //  WAJP to solve quadratic equatioN
public class AssigmentQ2 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("input a = ");
			double x =sc.nextInt();
			System.out.println("input b = ");
			double y=sc.nextInt();
			System.out.println("input c = ");
			double z=sc.nextInt();
			double root1,root2;
			double result=y*y-4*x*z;
			
			if (result>0) {
				root1=(- y +Math.sqrt(result))/(2*x);
				root2=(- y -Math.sqrt(result))/(2*x);
				System.out.println("root1= "+root1+" root2= " +root2);
			}else if(result==0) {
			root1=root2=-y/(2*x);
			System.out.println("root1=root2= "+root1);

		}else {
			System.out.println();
		}


	}

}
