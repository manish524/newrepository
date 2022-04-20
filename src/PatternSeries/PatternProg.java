package PatternSeries;

public class PatternProg {

	public static void main(String[] args) {
		for(int row=0; row<=5; row++) {
			for(int number=0; number<=row; number++) {
				System.out.print(number+"\t");
			}
			System.out.println();
		}
	}
	
}
