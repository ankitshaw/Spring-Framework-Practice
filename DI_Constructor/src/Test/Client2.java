package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test2;

public class Client2 {
	
	
	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/Spring2.xml");
		Test2 t = (Test2) ap.getBean("t");
		t.publicDate();
		
			
	}

}
