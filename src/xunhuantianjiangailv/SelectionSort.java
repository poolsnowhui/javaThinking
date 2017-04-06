package xunhuantianjiangailv;

import java.util.Arrays;

public class SelectionSort {
	public static void sort(int[] data){
		for (int i = 0; i < data.length; i++) {
			int low =i;
			for (int j =  data.length-1; j >i; j--) {
				if(data[j]<data[low]){
					low = j;
				}
			}
			swap(data, i, low);
		}
	}
	public static void swap(int[] data,int i,int j){
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	public static void main(String[] args) {
		int [] data = {3,5,4,5,2,1};
		SelectionSort.sort(data);
		System.out.println(Arrays.toString(data));
	}
}
