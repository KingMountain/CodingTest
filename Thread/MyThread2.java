package com.example.thread;

public class MyThread2 extends Thread{
	
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			Controller.getInstance().printLine();
		}
	}

}
