package stringTochar;

import java.util.Arrays;

public class Test1 implements WelcomeGuys {

	public void show() {
		String name = "AMOL ALLHAT";
		char[] seqArr = name.toCharArray();
		System.out.print(Arrays.toString(seqArr));
	}
	
}
