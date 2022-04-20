package factorialOfnum;

import java.util.*;

public class Try1 extends FactOfNum{

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number = ");
		Scanner abc = new Scanner(System.in);
		n = abc.nextInt();
		FactOfNum rr = new FactOfNum();
		rr.setValue(n);
		rr.getValue();
		
		
	}
	
}
