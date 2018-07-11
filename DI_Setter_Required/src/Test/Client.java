package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {
	
	public static void main(String[] args) {
		
//		String xml[] = new String[] {"resources/Engine_Spring.xml","resources/Car_Spring.xml"};
		
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/Spring.xml");
		
		Test t = (Test) ap.getBean("t");
		t.printData();
		
//		Test t1 = (Test) ap.getBean("t1");
//		t1.printData();
		
		
			
	}

}
