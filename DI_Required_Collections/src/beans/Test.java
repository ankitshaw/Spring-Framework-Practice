package beans;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
	private Vector fruits;
	private TreeSet cricketers;
	private Hashtable countryCapitals;
	
	public void setCountryCapitals(Hashtable countryCapitals) {
		this.countryCapitals = countryCapitals;
	}
	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}
	public void setFruits(Vector fruits) {
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
			System.out.println("Country="+key+" : Capital="+countryCapitals.get(key));
		}
		
		
	}
	
}
