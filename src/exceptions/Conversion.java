package exceptions;

import java.math.BigInteger;

public class Conversion {
	public static void main(String[] args) {
		char u = 'a';
//		System.out.format("d=%d\n", u);
		System.out.format("d=%c\n", u);
		System.out.format("d=%b\n", u);
		System.out.format("d=%s\n", u);
//		System.out.format("d=%f\n", u);
//		System.out.format("d=%e\n", u);
//		System.out.format("d=%x\n", u);
		System.out.format("d=%h\n", u);
		System.out.format("d=%%\n");
		int v = 121;
		System.out.format("d=%d\n", v);
		System.out.format("d=%c\n", v);
		System.out.format("d=%b\n", v);
		System.out.format("d=%s\n", v);
//		System.out.format("d=%f\n", v);
//		System.out.format("d=%e\n", v);
		System.out.format("d=%x\n", v);
		System.out.format("d=%h\n", v);
		System.out.format("d=%%\n");
		BigInteger b = new BigInteger("5000000000000");
		System.out.println();
		System.out.format("d=%d\n", b);
//		System.out.format("d=%c\n", b);
		System.out.format("d=%b\n", b);
		System.out.format("d=%s\n", b);
//		System.out.format("d=%f\n", b);
//		System.out.format("d=%e\n", b);
		System.out.format("d=%x\n", b);
		System.out.format("d=%h\n", b);
		System.out.format("d=%%\n");
		double d = 135.34;
//		System.out.format("d=%d\n", d);
//		System.out.format("d=%c\n", d);
		System.out.format("d=%b\n", d);
		System.out.format("d=%s\n", d);
		System.out.format("d=%f\n", d);
		System.out.format("d=%e\n", d);
//		System.out.format("d=%x\n", d);
		System.out.format("d=%h\n", d);
		System.out.format("d=%%\n");
	}
}
