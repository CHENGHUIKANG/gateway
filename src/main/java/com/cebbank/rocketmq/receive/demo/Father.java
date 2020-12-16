package com.cebbank.rocketmq.receive.demo;


public abstract class Father {
	public void testMethod(){
		System.out.println("testMethod");
		testMethod02();
	}
	
	public void testMethod02(){
		System.out.println("testMethod02");
	}
}
