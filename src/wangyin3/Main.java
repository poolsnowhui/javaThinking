package wangyin3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m;
		n = in.nextInt();
		m = in.nextInt();
		in.close();
		if (n >= 1 && m <= 75&&m>=0) {
			int[][] tian = new int[n][m];
			for (int i = 0; i < tian.length; i++) {
				String line = in.nextLine();
				char[] li = line.toCharArray();
				for (int j = 0; j < li.length; j++) {
					if (li[j] >= '0' && li[j] <= '9') {
						tian[i][j] = li[j] - '0';
					} else {
						return;
					}
				}
			}
			// for()//
		} else {
			return;
		}
	}
}
