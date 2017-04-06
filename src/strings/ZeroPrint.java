package strings;

public class ZeroPrint {
	public static void main(String[] args) {
		// int i=0;
		// System.out.println(i++);
		// System.out.println(i+'0');
		// System.out.println(i);
		// System.out.println(i--);
		String i = "12345", s;
		s = getStr(i);
		for (int j = 0; j < i.length(); j++) {
			iner: for (int j2 = 0; j2 < i.length(); j2++) {
				System.out.println(j2);
				if (j2 == 2)
					break iner;
			}
		}
		System.out.println(s);
	}

	public static String getStr(String s) {
		assert (s != null && s.length() > 0) : "s非法";
		StringBuffer sb = new StringBuffer();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}
