package com.leo.spring;

import com.leo.beans.AppConfig;
import com.leo.beans.AppConfig2;
import com.leo.beans.Mundo;
import com.leo.beans.Persona;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
//		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/leo/xml/beans.xml");
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
//		ApplicationContext appContext = new AnnotationConfigApplicationContext();
		/*
		 * Anotaciones
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		
		appContext.register(AppConfig.class);
		appContext.register(AppConfig2.class);
		appContext.refresh();

		Mundo m = (Mundo) appContext.getBean("mundo");
		
		
		System.out.println(m.getSaludo());
		
		 */
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/leo/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");
		
		System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo());
		((ConfigurableApplicationContext)appContext).close();

	}

}
