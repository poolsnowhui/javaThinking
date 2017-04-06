package reflect;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DumpMethods {
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("java.util.Stack");
			Constructor<?>[] con = c.getDeclaredConstructors();
			Field[] f = c.getDeclaredFields();
			for (int i = 0; i < con.length; i++) {
				System.out.println(con[i].toString());
			}
			Method[] m = c.getDeclaredMethods();
			for (int i = 0; i < m.length; i++) {
				System.out.println(m[i].toString());
			}
			for (int i = 0; i < f.length; i++) {
				System.out.println(f[i].toString());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			RandomAccessFile raf = new RandomAccessFile("myfile.txt", "rw");
			raf.read();
			raf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
