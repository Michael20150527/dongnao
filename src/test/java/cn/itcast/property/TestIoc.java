package cn.itcast.property;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.ioc.UserService;

public class TestIoc {
	/**
	@Test
	public void testAdd(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		PropertyDemo1 demo = (PropertyDemo1) context.getBean("demo");
		demo.test1();
	}
	
	@Test
	public void testBook(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		Book demo = (Book) context.getBean("book");
		demo.test1();
	}
	
	@Test
	public void testUserService(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		UserService service = (UserService) context.getBean("userService");
		service.add();
	}
	
	@Test
	public void testPerson(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		Person person = (Person) context.getBean("person");
		person.test1();
	}
**/
}
