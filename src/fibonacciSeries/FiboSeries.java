			
							/* Fibonacci Series */

package fibonacciSeries;


import java.util.*;

public class FiboSeries {
	int term;
	
	public void Fibo1()
	{
		
	}
	
	public static void main(String[] arg) {

		int a=0, b=1,c, term;
		Scanner tt = new Scanner(System.in);
		System.out.print("Enter the term = ");
		term=tt.nextInt();
		for(int i=1;i<=term; i++) {

			System.out.println(a);
			
			c=a+b;
			
			a=b;
			
			b=c;
			
			
		}
		
	}
	
}
