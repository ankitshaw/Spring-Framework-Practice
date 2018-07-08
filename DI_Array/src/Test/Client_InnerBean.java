package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client_InnerBean {
	
	public static void main(String[] args) {
				
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/Car-Engine_Spring.xml");
		
		Car c = (Car) ap.getBean("c");
		c.printCarData();
				
	}

}
