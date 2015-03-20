package com.example.reverse;

public class Reverse {

	//three way to reverse
	public static void Reverse1(String str) {
		StringBuffer sb = new StringBuffer(str).reverse();
		System.out.println(sb);
	}
	
	public static void Reverse2(String str){
		if(str.length() == 1) 
			System.out.print(str);
		else if(str.length() > 1){
			System.out.print(str.substring(str.length()-1));
			String nextString = str.substring(0,str.length()-1);
			Reverse2(nextString);
		}
	}
	
	public static void Reverse3(String str) {
		for(int i=str.length()-1;i >= 0;i--) {
			System.out.print(str.charAt(i));
		}
	}
}
