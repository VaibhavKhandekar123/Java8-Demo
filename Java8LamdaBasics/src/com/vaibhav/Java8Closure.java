package com.vaibhav;

public class Java8Closure {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		 int b = 20;
		int a = 10;

		doProcess(a, i-> System.out.println(i+b));
		
	}

	private static void doProcess(int a, Process process) throws Exception{
	//Thread.sleep(2000);
		process.operate(a);

	}

}

interface Process {
	void operate(int i);
}
