package wangyin2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m, x0, y0, k;
		n = in.nextInt();
		m = in.nextInt();
		in.close();
		if (1 <= n && m < -50 & n >= 0 & m >= 0) {

			String di = "";
			int[][] dilao = new int[n][m];
			int temp = 0;
			for (int i = 0; i < n; i++) {
				di = in.nextLine();
				char[] d = di.toCharArray();
				for (int j = 0; j < d.length; j++) {
					if (d[j] == '.') {
						dilao[i][j] = 1;
						temp++;
					} else if (d[j] == 'X') {
						dilao[i][j] = 0;
					} else {
						return;
					}

				}
			}
			if (temp < 2) {
				return;
			}
			x0 = in.nextInt();
			y0 = in.nextInt();
			if (x0 >= 0 && x0 < n && y0 >= 0 && y0 < m && dilao[x0][y0] == 1) {
				k = in.nextInt();
				int[] dx = new int[k];
				int[] dy = new int[k];
				for (int i = 0; i < k; i++) {
					dx[i] = in.nextInt();
					dy[i] = in.nextInt();
				}

				//广度优先遍历
				int cishu = -1;
				System.out.println(cishu);

			} else {
				return;
			}
		} else {
			return;
		}
	}
}
