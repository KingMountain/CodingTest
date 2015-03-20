package com.example.pailei;

import java.util.ArrayList;

public class Pai {

	public static void Pai(String str) {
		if(str != null && str != "") {
			Pai(StrToList(str),"");
		}
	}
	private static void Pai(ArrayList<Character> list, String preStr) {
		//print area
		if(preStr != "")
			System.out.println(preStr);
		
		for(int i=0;i<list.size();i++) {
			ArrayList<Character> temp = new ArrayList<>(list);
			Pai(temp,preStr+temp.remove(i));
		}
	}
	private static ArrayList<Character> StrToList(String str) {
		ArrayList<Character> mArrayList = new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			mArrayList.add(str.charAt(i));
		}
		return mArrayList;
	}
	
}
