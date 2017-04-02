package com.leo.spring;

import com.leo.beans.Mundo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/leo/xml/beans.xml");
		Mundo m = (Mundo) appContext.getBean("mundo");
		
		System.out.println(m.getSaludo());
		
		((ConfigurableApplicationContext)appContext).close();

	}

}
