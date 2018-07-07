package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client {
	
	public static void main(String[] args) {
		
//		String xml[] = new String[] {"resources/Engine_Spring.xml","resources/Car_Spring.xml"};
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/Car_Spring.xml","resources/Engine_Spring.xml");
		
		Car c = (Car) ap.getBean("c");
		c.printCarData();
		
		
			
	}

}
