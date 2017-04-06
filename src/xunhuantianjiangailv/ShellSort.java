package xunhuantianjiangailv;

import java.util.Arrays;

public class ShellSort {
	public static void sort(int [] data){
		for (int i = data.length/2; i > 2; i/=2) {
			for (int j = 0; j < i; j++) {
				insertSort(data, j, i);
			}
		}
		insertSort(data, 0, 1);
	}
	public static void insertSort(int[] data,int start,int inc){
		for (int i = start+inc; i < data.length; i+=inc) {
			for (int j = i; j >=inc&&data[j]<data[j-inc]; j-=inc) {
				swap(data, j, j-inc);
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
		ShellSort.sort(data);
		System.out.println(Arrays.toString(data));
		
	}
}
