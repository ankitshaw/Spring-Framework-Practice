package beans;

public class Test3 {

		private String name;
		private int age;
		private String email;
		
			
		public Test3(String name, int age, String email) {
			this.name = name;
			this.age = age;
			this.email = email;
		}
		
		public void publicDate() {
			
			System.out.println("Name: "+name);
			System.out.println("Age: " +age);
			System.out.println("Email :"+email);

		}
		
		
		
		
}
