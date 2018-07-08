package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.core.env.SystemEnvironmentPropertySource;

public class Test {
	private List fruits;
	private Set cricketers;
	private Map countryCapitals;
	
	public void setCountryCapitals(Map countryCapitals) {
		this.countryCapitals = countryCapitals;
	}
	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	
	public void printData() {
		
		System.out.println("Fruits............");
		for (Object fruit : fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("Cricketers.........");
		for (Object cricketer : cricketers) {
			System.out.println(cricketer);
		}
		
		System.out.println("Countries and Capitals........");
		Set keys = countryCapitals.keySet();
		for (Object key : keys) {
			System.out.println("Country= "+key+" : Capital= "+countryCapitals.get(key));
		}
		
		
	}
	
}
