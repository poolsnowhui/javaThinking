package xunhuantianjiangailv;
class Base2{
	static int oak = 99;
}
public class Doverdale extends Base2 {
	public static void main(String[] args) {
		Doverdale d = new Doverdale();
		d.amethod();
	}
	public void amethod(){
		oak = 33;
	}
}
