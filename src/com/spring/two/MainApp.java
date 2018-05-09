package com.spring.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Spring ������
 * */
public class MainApp {

	public static void main(String[] args) {
		
		//singleton ������
		ApplicationContext conSin = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objSin = (HelloWorld) conSin.getBean("singleton");
		objSin.setMessage("������!");
		objSin.getMessage();
		
		HelloWorld objSing = (HelloWorld) conSin.getBean("singleton");
		objSing.getMessage();
		
		//prototype ������
		ApplicationContext conPro = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objPro = (HelloWorld) conPro.getBean("prototype");
		objPro.setMessage("�ƺ�ˮ��");
		objPro.getMessage();
		HelloWorld objProt = (HelloWorld) conPro.getBean("prototype");
		objProt.getMessage();
		
	}
}
