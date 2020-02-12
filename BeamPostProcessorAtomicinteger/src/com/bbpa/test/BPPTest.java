package com.bbpa.test;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bppa.beans.ObjectCounter;
import com.bppa.beans.ObjectCounterBeanPostProcessor;
import com.bppa.beans.Workers;

public class BPPTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bppa/common/application-context.xml");
		//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bppa/common/application-context.xml"));
		BeanPostProcessor bpp = context.getBean("objectCounterPostProcessor",ObjectCounterBeanPostProcessor.class);
	//	((ConfigurableListableBeanFactory)context).addBeanPostProcessor(bpp);
		Workers workers = context.getBean("workers",Workers.class);
		System.out.println("Total Objects are:"+ObjectCounter.getNo_of_instance());
	}
}
