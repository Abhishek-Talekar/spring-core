package com.bs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bs.beans.Machine;

public class BSTest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("com/bs/common/application-context.xml"));
		
		Machine machine1 = beanFactory.getBean("machine",Machine.class);
		Machine machine2 = beanFactory.getBean("machine",Machine.class);
		machine1.run();
		System.out.println(machine1.hashCode());
		System.out.println(machine2.hashCode());
		System.out.println(machine1==machine2);
	}
}
