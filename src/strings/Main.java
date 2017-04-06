package strings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {

			int n = in.nextInt();
			int s = in.nextInt();
			int L = in.nextInt();

			if (s > 0 && n > 0 && n <= 100 && s <= L && L <= 10000) {
				int single = (L + 1) / (s + 1);// 单碟歌曲数

				if (single > n)
				{
				single = n;
				}
				if (single % 13 == 0) {
					single--;
				}
				int cd = n / single;
				if (n % single == 0) {

				} else {
					cd++;
				}
				if ((n % single != 0) && ((n % single) % 13 == 0) && (n % single == single -1))
					cd++;
				System.out.println(cd);
			} else {
				return;
			}
		} catch (InputMismatchException e) {
			return;
		}finally {
			in.close();
		}
	}
}
