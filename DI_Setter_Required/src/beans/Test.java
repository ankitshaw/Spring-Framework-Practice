package beans;

import org.springframework.beans.factory.annotation.Required;

public class Test {
	
	private Test2 t2 ;
	private String driver;
	private String url;
	private String user;
	private String password;
	
	
	public Test() {
		super();
	
	}


	public Test(String driver, String url, String user, String password) {
		super();
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
	}


	public String getDriver() {
		return driver;
	}

	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}


	public String getUrl() {
		return url;
	}

	@Required
	public void setUrl(String url) {
		this.url = url;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	public void printData() {
		System.out.println(driver+"\n"+url+"\n"+user+"\n"+password);
	}
	
	public Test2 getT2() {
		return t2;
	}

	@Required
	public void setT2(Test2 t2) {
		this.t2 = t2;
	}

	

}
