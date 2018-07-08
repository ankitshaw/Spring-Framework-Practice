package beans;

public class Car{
	
	private String[] carname;
	private Engine[] engine;

	public Car() {
		System.out.println("Car");
	}
	
	public void setCarname(String[] carname) {
		this.carname = carname;
	}
	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}
	
	public void printCarData() {
		for (String car : carname) {
			System.out.println("Car: "+car);
		}
		
		for (Engine e : engine) {
			
			System.out.println("Model Year: "+e.getModelyear());
			
		}
	}

}
