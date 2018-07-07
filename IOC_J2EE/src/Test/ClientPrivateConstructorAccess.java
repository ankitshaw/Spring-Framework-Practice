package Test;

import java.lang.reflect.Constructor;

public class ClientPrivateConstructorAccess {

	public static void main(String[] args) {
	
		try {
			Class c = Class.forName("beans.TestPrivateConstructorAccess");
			Constructor con[] = c.getDeclaredConstructors();
						con[0].setAccessible(true);
						con[0].newInstance();
						
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
