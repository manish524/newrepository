package fibonacciSeries;

public class One1 {

	public static void main(String[] args) {
		int a=0, b=1, c;
		for(int i=1;i<6; i++) {
			System.out.print(a+ "  ");
			c=a+b;
			a=b;
			b=c;
		}
	}
	
}
