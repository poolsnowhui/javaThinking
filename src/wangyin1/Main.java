package wangyin1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] line = new String[50];
		for (int i = 0; in.hasNextLine() && i < 50; i++) {
			line[i] = in.nextLine();
		}
		in.close();

		Map<String, Integer> str1 = new HashMap<String, Integer>();
		for (int i = 0; i < line.length; i++) {
			String[] strline = line[i].split(" ");
			if (strline.length >= 50) {
				return;
			}
			for (int j = 0; j < strline.length; j++) {
				char[] c = strline[j].toCharArray();
				for (int k = 0; k < c.length; k++) {
					if (Character.isUpperCase(c[k])) {

					} else {
						return;
					}
				}
				str1.put(strline[j], 1);
			}
		}
		System.out.println(str1.size());

	}

}
