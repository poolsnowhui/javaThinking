package wangyintest;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		String str1 = "abc" + "def";
		String str2 = new String(str1);
		if (str1 == str2) {
			System.out.println("true");

		}
		int j = 0xfffffff1;
		int i = ~j;
		System.out.println(i);
		HashMap<Integer, String> map = new HashMap<>();
		map.put(6, str2);
		map.put(4, str2);
		map.put(2, str2);
		map.put(1, str2);
		map.put(null, str2);
		map.put(null, str2);
		for (Iterator<Integer> iterator = map.keySet().iterator(); iterator.hasNext();) {
			Integer type = iterator.next();
			System.out.println(type);

		}
	}
}
