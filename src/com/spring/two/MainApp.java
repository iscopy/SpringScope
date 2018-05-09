package com.spring.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Spring 作用域
 * */
public class MainApp {

	public static void main(String[] args) {
		
		//singleton 作用域
		ApplicationContext conSin = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objSin = (HelloWorld) conSin.getBean("singleton");
		objSin.setMessage("君不见!");
		objSin.getMessage();
		
		HelloWorld objSing = (HelloWorld) conSin.getBean("singleton");
		objSing.getMessage();
		
		//prototype 作用域
		ApplicationContext conPro = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objPro = (HelloWorld) conPro.getBean("prototype");
		objPro.setMessage("黄河水！");
		objPro.getMessage();
		HelloWorld objProt = (HelloWorld) conPro.getBean("prototype");
		objProt.getMessage();
		
	}
}
