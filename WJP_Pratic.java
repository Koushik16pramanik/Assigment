package Activity;
import java.util.*;
//WJP to print numbers between 1 to 200 which are divisible by 5, 7 and by both.
	class WJP_Pratic{
	static int NumGen(int n)
	{
		// Iterate from 0 to N
		for(int j = 1; j < n + 1; j++)
		{
      // Short-circuit operator is used
		if (j % 5 == 0 || j % 7 == 0)
			System.out.print(j + " ");
		}
		return n;
	}
	// Driver code
	public static void main(String args[]) {
		int N = 50;   // Iterating over generator function
		NumGen(N);
	}}
