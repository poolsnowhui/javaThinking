package object;

public class AllTheColorsOfTheRainbow {
	
	int anIntegerRepresentingColors;
	void changeTheHueOfTheColor(int newHue){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(6.2/3);
		System.out.println((int)(5/3.0+0.5));
		System.out.println((float)5/3);
		int i =0;
		i+=i>0?i++:i--;
		System.out.println(i);
		System.out.println(fun(2345));
	}
	static int fun(int x){
		int c =0;
		while (x!=0) {
			c++;
			x=x&(x-1);
		}
		return c;
	}

}
