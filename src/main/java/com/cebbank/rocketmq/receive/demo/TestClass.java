package com.cebbank.rocketmq.receive.demo;

public class TestClass {
	public static void main(String[] args) {
//		Son son = new Son();
//		son.testMethod();
		System.out.println("xx");
		Son son = new Son();
		if (son instanceof Father || 2>3) {
			System.out.println("true");
		}
	}
}
