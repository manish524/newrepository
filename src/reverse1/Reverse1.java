package reverse1;

public class Reverse1 {
	
	public static void main(String[] args) {
		String name = "Amol";
		char[] str = name.toCharArray();
		for(int i=str.length-1; i>=0; i--) {
			System.out.print(str[i]);
		}
	}
	
}
