package factorialOfnum;

import java.util.Scanner;

public class FactOfNum {

	int value;
	
	void setValue(int y) {
		value = y;
	}
	void getValue() {
		int fact=1;
		for(int i=1; i<=value; i++) { 					//i=1, 2, 3, 4
			fact = fact*i; 							//fact=1, 2, 6, 24, 120
		}
		System.out.println("Factorial of " + value +" = " + fact);
	}
	
}
