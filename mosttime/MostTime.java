package com.example.mosttime;

public class MostTime {

	public static void MostTime(String str) {
		str = str.replaceAll(" ", "");
		int [] list = new int[256];
		for(int i=0;i<str.length();i++) {
			list[(int)str.charAt(i)]++;
		}
		int ascValue = 0;
		int most=0;
		for(int i=0;i<list.length;i++) {
			if(list[i]>0) {
				if(list[i]>most) {
					ascValue = i;
					most = list[i];
				}
			}
		}
		System.out.println((char)ascValue+ "   :  "+most+"  times");
	}
}
