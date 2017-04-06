package ioput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InputData{
	private static String s ="";
	public static void input(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int getInt(){
		input();
		return Integer.parseInt(s);
	}
}
class Result{
	void print(int d){
		if((d!=0)&&((d-1)&d)==0){
			System.out.println(d+"是2的阶次");
		}else {
			System.out.println(d+"不是2的阶次");
		}
	}
}
public class PrintResult {
	public static void main(String[] args) {
		System.out.println("请输入一个整数:");
		Result r = new Result();
		r.print(InputData.getInt());
		
		
	}
	
}
