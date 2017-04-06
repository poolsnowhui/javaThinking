package xunhuantianjiangailv;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		if (N > 0 && N < 10000) {
			int[] num = new int[4];

			int result = 0;
			while (result != 6174) {
				num[0] = N / 1000;
				num[1] = N % 1000 / 100;
				num[2] = N % 100 / 10;
				num[3] = N % 10 / 1;
				num = sort(num);
				int first = 0;
				for (int i = 0; i < num.length; i++) {
					first += num[i] * (int) (Math.pow(10, num.length - 1 - i));
				}
				int second = 0;
				for (int i = 0; i < num.length; i++) {
					second += num[i] * (int) (Math.pow(10, i));
				}
				result = first - second;
				if (first != second) {
					String fi = "" + first / 1000 + first % 1000 / 100 + first % 100 / 10 + first % 10 / 1;
					String se = "" + second / 1000 + second % 1000 / 100 + second % 100 / 10 + second % 10 / 1;
					String re = "" + result / 1000 + result % 1000 / 100 + result % 100 / 10 + result % 10 / 1;
					System.out.println(fi + " - " + se + " = " + re);
				} else {
					System.out.println("N - N = " + "0000");
					break;
				}
				N = result;
			}
		} else {
			return;
		}
	}

	public static int[] sort(int[] num) {
		int temp;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {// 前面小交换，非递增
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		return num;
	}
}