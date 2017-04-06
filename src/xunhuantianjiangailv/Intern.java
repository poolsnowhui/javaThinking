package xunhuantianjiangailv;

public class Intern {
	public static void main(String[] args) {
//		String s1 = "hello";
//		String s2 = new String("hello");
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//		s2 = s2.intern();
//		System.out.println(s1==s2);
//		StringBuffer sb = new StringBuffer(2);
//		sb.append(s1).append(s2);
//		System.out.println(sb);
		StringBuffer tmp=new StringBuffer(10000);
		for (int i = 0; i < 9999; tmp.append("x")) {
			i++;
		}
		System.out.println(tmp);
	}
	class A{
		 void  test(){
			System.out.print("testA");
			
		}
	}
	class B extends A{
		@Override
		void test() {
			System.out.print("testA");
		}
	}
}
