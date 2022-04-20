package factorialOfnum;

import java.util.*;

public class Try2 {

	public static void main(String[] args) {
		int num,fact=1;
		Scanner jj = new Scanner(System.in);
		System.out.print("Enter the value = ");
		num=jj.nextInt();
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
		
	}
	
}
