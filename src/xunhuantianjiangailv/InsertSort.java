package xunhuantianjiangailv;

import java.util.Arrays;

public class InsertSort {
	public static void sort(int[] data){
		for (int i = 1; i < data.length; i++) {
			for (int j = i; j > 0&&data[j]<data[j-1]; j--) {
				swap(data, j, j-1);
			}
		}
	}
	public static void swap(int[] data,int i,int j){
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	public static void main(String[] args) {
		int [] data1 = {3,5,4,5,2,1};
		InsertSort.sort(data1);
		System.out.println(Arrays.toString(data1));
	}
}
