package cn.itcast.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.bean.Bean2;
import cn.itcast.bean.Bean3;

public class TestUser {
	
	@Test
	public void testAdd(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		User user1 = (User) context.getBean("user");
		System.out.println(user1);
		User user2 = (User) context.getBean("user");
		System.out.println(user2);
	}
	
	@Test
	public void testBean2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		Bean2 bean2 = (Bean2) context.getBean("bean2");
		System.out.println(bean2);
		bean2.add();
	}
	
	@Test
	public void testBean3(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		Bean3 bean3 = (Bean3) context.getBean("bean3");
		System.out.println(bean3);
		bean3.add();
	}

}
