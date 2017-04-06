//: object/ShowProperties.java
package object;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @see ioput.PrintResult
 * @version 1.0
 * @author qazcxh@163.com
 * @author CXH
 * @since JDK1.8
 */
public class ShowProperties {

	/**
	 * 
	 * @param args
	 *            args is String[] {@link ShowProperties#f()}
	 */
	public static void main(String[] args) {
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));

	}

	/**
	 * @deprecated abandoned
	 * @return return 1;
	 * @throws IOException
	 */
	public int f() throws IOException {
		File f = new File("1.txt");
		f.mkdirs();
		FileOutputStream fos = new FileOutputStream(f);
		fos.close();
		return 1;
	}

}/// :~
