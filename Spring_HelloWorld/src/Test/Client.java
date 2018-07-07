package Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client {

	public static void main(String[] args) {
		// find xml
		Resource res = new ClassPathResource("resources/Spring.xml");

		// load xml to container
		BeanFactory factory = new XmlBeanFactory(res);

		// create test classes object
		Object o = factory.getBean("t");
		Object o1= factory.getBean("t"); //singleton only one object is created
		Object o2 = factory.getBean("t");
		
		System.out.println(o == o1);
		System.out.println(o1 == o2);
		
		Test t = (Test) o;
		t.hello();
	}

}
