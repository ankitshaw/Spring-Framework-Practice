package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test3;

public class Client3 {
	
	
	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/Spring3.xml");
		Test3 t = (Test3) ap.getBean("t");
		t.publicDate();
		
			
	}

}
