package com.example.john;

import java.util.ArrayList;

public class John {

	//直接用数组做
	public static void John1(int totalNum, int countNum) {
		//Init
		int [] people = new int[totalNum];
		for(int i=0;i<totalNum;i++)
			people[i] = i+1;
		int i = 0;
		int j = 1;
		int n = countNum;
		int m = totalNum;
		while(m > 0) {
			if(people[i%totalNum] > 0) {
				if(j%n == 0) {
					System.out.println(people[i%totalNum]);
					people[i%totalNum] = -1;
					i++;
					j = 1;
					m--;
				}else {
					i++;
					j++;
				}
			}else {
				i++;
			}
		}
		
		
		
	}
	
	
	//直接用List
	public static void John2(int totalNum,int countNum) {
		ArrayList<Integer> mArrayList = new ArrayList<>();
		for(int i=0;i<totalNum;i++) {
			mArrayList.add(i+1);
		}
		//start from k
		int k = 0;
		while(mArrayList.size() > 0) {
			k = k + countNum -1;
			k = k % mArrayList.size();
			System.out.println(mArrayList.get(k));
			mArrayList.remove(k);
		}
	}
	
	//构造环
	private static class Node{
		public int element;
		public Node(int element) {
			this.element = element;
		}
		Node nextNode;
	}
	public static void John3(int totalNum,int countNum) {
		//Init
		Node root = null;
		Node tailNode = null;
		Node preNode = null;
		for(int i=0;i<totalNum;i++) {
			if(i == 0) {
				root = tailNode = new Node(i+1);
			}else {
				tailNode.nextNode = new Node(i+1);
				tailNode = tailNode.nextNode;
			}
		}
		tailNode.nextNode = root;
		preNode = root;
		while(tailNode.nextNode != tailNode) {
			for(int j=0;j<countNum;j++) {
				preNode = tailNode;
				tailNode = tailNode.nextNode;
			}
			//remove
			System.out.println(tailNode.element);
			preNode.nextNode = tailNode.nextNode;
			tailNode = preNode.nextNode;
		}
		System.out.println(tailNode.element);
		
	}
	
}
