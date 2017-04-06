package net.mindview.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class BinaryFile{
	public static byte[] read(String fileName){
		File f = new File(fileName);
		FileInputStream fis;
		byte[] b = null;
		try {
			fis = new FileInputStream(f);
			b = new byte[(int) f.length()];
			try {
				fis.read(b);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		return b;
	}
}
public class Hex {
	public static String format(byte[] data){
		StringBuilder result = new StringBuilder();
		int n = 0;
		for (byte b : data) {
			if(n%16==0) 
				result.append(String.format("%05X:", n));
			result.append(String.format("%02X ", b));
			n++;
			if(n%16==0)
				result.append("\n");
		}
		return result.toString();
	}
	public static void main(String[] args) {
		if(args.length==0)
			System.out.println(format(BinaryFile.read("Hex.class")));
		else{
			System.out.println(format(BinaryFile.read(args[0])));
		}
	}
}
