package com.cebbank.rocketmq.receive.aopDemo;

import org.springframework.aop.aspectj.autoproxy.AspectJAwareAdvisorAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.AbstractAdvisorAutoProxyCreator;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.cebbank.rocketmq.receive.rocketmq.Consumer;

/**
 * 
 * @author Administrator
 * AnnotationAwareAspectJAutoProxyCreator
 * 
 * 
 * AnnotationAwareAspectJAutoProxyCreator
 * 	->AspectJAwareAdvisorAutoProxyCreator
 *		->AbstractAdvisorAutoProxyCreator
 *			->AbstractAutoProxyCreator
 *				implements SmartInstantiationAwareBeanPostProcessor, BeanFactoryAware
 *
 *AbstractAutoProxyCreator.setBeanFactory()
 *AbstractAutoProxyCreator.postProcessBeforeInstantiation()
 *AbstractAutoProxyCreator.postProcessAfterInitialization()
 *
 *AbstractAdvisorAutoProxyCreator.setBeanFactory()->initBeanFactory()
 *
 *AnnotationAwareAspectJAutoProxyCreator.initBeanFactory()
 *
 *InstantiationAwareBeanPostProcessor->postProcessBeforeInstantiation()
 *BeanPostProcessor->postProcessBeforeInitialization()
 *
 */
@EnableAspectJAutoProxy
@Configurable
public class AopDemo {

	@Bean
	public MathCalculator mathCalculator(){
		return new MathCalculator();
	}

	@Bean
	public LogAspects logAspects(){
		return new LogAspects();
	}
	
	
}
