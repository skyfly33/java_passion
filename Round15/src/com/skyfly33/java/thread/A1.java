package com.skyfly33.java.thread;

public class A1 implements Runnable{

	@Override
	public void run() {
		System.out.println("\nHere is MyThread!!");
		for(int i = 0; i < 100; i++){
			for(char ch = 'A'; ch <= 'z'; ch++){
				System.out.print(ch);
			}
		}
	}

}