package com.example.pa;

public class Sort {

	//冒泡排序
	public static void BubbleSort(double [] list) {
		boolean change = true;
		for(int i=0;i<list.length-1&&change;i++) {
			change = false;
			for(int j=0;j<list.length-1-i;j++) {
				if(list[j] > list[j+1]) {
					change = true;
					double temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}		
			}	
		}	
	}
	
	//归并排序
	public static void MergeSort(double [] list) {
		if(list.length > 1) {
			int index = list.length/2;
			double [] leftpart = new double[index];
			double [] rightpart = new double[list.length-index];
			System.arraycopy(list, 0, leftpart, 0, index);
			System.arraycopy(list, index, rightpart, 0, rightpart.length);
			MergeSort(leftpart);
			MergeSort(rightpart);
			double [] temp = Merge(leftpart, rightpart);
			System.arraycopy(temp, 0, list, 0, list.length);
		}
	}
	private static double[] Merge(double[] left,double[]right) {
		double [] temppart = new double[left.length+right.length];
		int current = 0;
		int current1 = 0;
		int current2 = 0;
		while(current1 < left.length && current2 < right.length) {
			if(left[current1] < right[current2]) 
				temppart[current++] = left[current1++];
			else 
				temppart[current++] = right[current2++];
		}
		while(current1 < left.length) {
			temppart[current++] = left[current1++];
		}
		while(current2 < right.length) {
			temppart[current++] = right[current2++];
		}
		
		return temppart;
	}
	
	//快排
	public static void QuickSort(double[] list) {
		QuickSort(list,0,list.length-1);
	}
	private static void QuickSort(double[] list,int start,int end) {
		if(start < end) {
			int pivotindex = Partition(list, start, end);
			QuickSort(list, start, pivotindex-1);
			QuickSort(list, pivotindex+1, end);
		}
	}
	private static int Partition(double[] list,int start,int end) {
		double pivot = list[start];
		int low = start + 1;
		int high = end;
		while(low < high) {
			if(low <= high && list[low] <= pivot) 
				low++;
			if(low <= high && list[high] >pivot)
				high --;
			if(low < high) {
				double temp = list[low];
				list[low] = list[high];
				list[high] = temp;
			}
		}
		
		if(pivot > list[high]) {
			list[start] = list[high];
			list[high] = pivot;
			return high;
		}else {
			return start;
		}
	}
}
