package fibonacciSeries;

public class Test1 {

	public static void main(String[] args) {
		int a=0, b=1,c;
		for(int i=1;i<=5;i++) {
			System.out.println(a);
			c=a+b; 
			a=b;
			b=c;
		}
	}
	
}
