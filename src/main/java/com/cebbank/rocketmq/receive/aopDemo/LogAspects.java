package com.cebbank.rocketmq.receive.aopDemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAspects {
	
	@Pointcut("execution(public int com.cebbank.rocketmq.receive.aopDemo.MathCalculator.*(..))")
	public void Pointcut(){
		
	}
	
	@Before("Pointcut()")
	//@Before("execution(public int com.cebbank.rocketmq.receive.aopDemo.MathCalculator.*(..))")
	public void logStart(){
		System.out.println("logStart");
	}
	
	@After("Pointcut()")
	public void logEnd(){
		System.out.println("logEnd");
	}
	
	@AfterReturning("Pointcut()")
	public void logReturn(){
		System.out.println("logReturn");
	}
	
	@AfterThrowing("Pointcut()")
	public void logException(){
		System.out.println("logExpection");
	}
}

