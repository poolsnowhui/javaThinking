package xunhuantianjiangailv;

import java.util.Random;

public class RandomTest_Repeat {
	public static void main(String[] args) {
		Random r = new Random(10l);
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt());
		}
	}
}
