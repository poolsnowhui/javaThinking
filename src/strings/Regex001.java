package strings;

import java.util.Arrays;

public class Regex001 {
	public static String knights = 
			"Then, when you have found the shrubbery, you must " +
			"cut down the mightiest tree!";
	public static void main(String[] args) {
		System.out.println("My name is xxx.".matches("[A-Z].*\\."));
		System.out.println(Arrays.toString(knights.split("\\sthe\\s|\\syou\\s")));
		System.out.println(knights.replaceAll("a|e|u|i|o", "_"));
	}
}
