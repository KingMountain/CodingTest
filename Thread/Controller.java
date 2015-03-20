package com.example.thread;

public class Controller {

	public static int mCurrentIndex = 1;

	private static Controller mInstance = new Controller();
	
	public static Controller getInstance() {
		return mInstance;
	}
	
	//奇数打印数字
	public synchronized void printNum(int num) {
		while((mCurrentIndex & 1) == 0)  {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print(num);
		mCurrentIndex++;
		notifyAll();
	}
	
	//偶数打印下划线
	public synchronized void printLine() {
		while((mCurrentIndex & 1) == 1)  {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print("_");
		mCurrentIndex++;
		notifyAll();
	}
	
	
}
