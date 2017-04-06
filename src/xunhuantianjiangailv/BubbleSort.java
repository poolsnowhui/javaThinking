package xunhuantianjiangailv;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author CXH
 *
 */
public class BubbleSort {
	public static void sort(int[] data){
		for (int i = 0; i < data.length; i++) {
			for (int j = data.length-1; j > i; j--) {
				if(data[j]<data[j-1]){
					swap(data, j-1, j);
				}
			}
		}
	}
	public static void swap(int[] data,int i,int j){
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	public static void main(String[] args) {
		int [] data = {3,5,4,5,2,1};
		BubbleSort.sort(data);
		System.out.println(Arrays.toString(data));
	}
}
