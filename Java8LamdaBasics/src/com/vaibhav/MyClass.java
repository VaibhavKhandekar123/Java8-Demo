package com.vaibhav;

import java.util.function.BiConsumer;

class MyClass{

	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		int key=0;
		
		operation(nums, key,wrapper((v,k) -> System.out.println(v/k)));
	}

	private static BiConsumer<Integer, Integer> wrapper(BiConsumer<Integer, Integer> consumer) {
		// TODO Auto-generated method stub
		return (a,b)-> {
			try {
				consumer.accept(a, b);
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmentic Ex caught in Wrapper Lambda...");
			}
			
		};
	}

	private static void operation(int[] nums, int key,BiConsumer<Integer, Integer> consumer) {
		
		for(int i:nums) {
			consumer.accept(i, key);
		}
	}
	
	
}




