package xunhuantianjiangailv;

public class TestOne {
	private int num[];
	
	public TestOne(int max){
		this.num = new int[max];
		System.out.println(max+"个随机数是：");
		for (int i = 0; i < max; i++) {
			num[i] = this.getRandomNum();
			System.out.println(num[i]+" ");
		}
		System.out.println();
		this.getTop10(this.num);
		this.FindMaxCount(this.num);
	}

	private void FindMaxCount(int[] num) {
		int maxValue = -1,maxCount = -1;
		int [] count = new int[101];
		for (int i = 0; i < num.length; i++) {
			count[num[i]]++;
			if(maxCount<count[num[i]]||(maxCount==count[num[i]]&&maxValue<num[i])){
				maxValue = num[i];
				maxCount = count[num[i]];
			}
		}
		System.out.println("max count number:"+maxValue+"the count:"+maxCount);
	}

	private void getTop10(int[] num) {//冒泡排序
		int temp =0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i; j < num.length; j++) {
				if(num[i]>num[j]){
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("排序后的数字是：");
		System.out.println(num[0]);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}

	private int getRandomNum() {
		return (int) (Math.random()*100);
	}
	public static void main(String[] args) {
		new TestOne(10);
	}
}
