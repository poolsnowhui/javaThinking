package xunhuantianjiangailv;

public class Sushu {
	public static void main(String[] args) {
		
		int a[] = new int[101];
		a[0] = 0;
		a[1] = 0;
		for (int i = 2; i < a.length; i++) {
			a[i] = 1;
		}
		for (int i = 2; i < a.length; i++) {
			
			if(a[i]!=0){
				
				for (int j = 2*i; j < a.length; ) {
					if(j%i == 0){
						a[j] = 0;
						j = j + i;
					}
					
				}
			}
		}
		for (int i = 2; i < a.length; i++) {
			if(a[i]!=0){
				System.out.println(i);
			}
		}
	}
	
}
