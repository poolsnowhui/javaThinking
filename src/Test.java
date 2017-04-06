import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		String input = "aavzcadfdsfsdhshgWasdfasdfdddaaa";
		new Test().doString(input);
	}

	public void doString(String input) {
		char[] chars = input.toCharArray();
		List<String> lists = new ArrayList<String>();
		Set<String> set = new TreeSet<String>();
		for (int i = 0; i < chars.length; i++) {
			lists.add(String.valueOf(chars[i]));
			set.add(String.valueOf(chars[i]));
		}
		System.out.println(set);
		Collections.sort(lists);
		System.out.println(lists);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < lists.size(); i++) {
			sb.append(lists.get(i));
		}
		input = sb.toString();
		System.out.println(input);

		int max = 0;
		String maxString = "";
		List<String> maxList = new ArrayList<String>();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String os = it.next();
			int begin = input.indexOf(os);
			int end = input.lastIndexOf(os);
			int value = end - begin + 1;
			if (value > max) {
				maxString = os;
				max = value;
				maxList.add(os);
			} else if (value == max) {
				maxList.add(os);
			}
		}
		int index = 0;
		for (int i = 0; i < maxList.size(); i++) {
			if (maxList.get(i).equals(maxString)) {
				index = i;
				break;
			}
		}
		System.out.println("出现最多字符分别为");
		for (int i = index; i < maxList.size(); i++) {
			System.out.println(maxList.get(i) + " ");
		}
		System.out.println();
		System.out.println("出现最多次数为：" + max);
	}
}
