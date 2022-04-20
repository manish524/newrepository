/* 		   *  
		   *  *  
		   *  *  *  
		   *  *  *  *  
		   *  *  *  *  *            */  



package PatternSeries;

public class Pattern1 {
	public static void main(String[] args) {
		for(int row=0; row<=4; row++){
			for(int number=0;number<=row; number++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
}
