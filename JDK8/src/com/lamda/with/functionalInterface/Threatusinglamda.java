package com.lamda.with.functionalInterface;

public class Threatusinglamda {
	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0;i<=10;i++)
			{
				System.out.println("Child class...");
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main class..");
		}
	}

}
