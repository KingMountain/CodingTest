package com.example.thread;

public class MyThread1 extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			Controller.getInstance().printNum(i);
		}
	}

}
