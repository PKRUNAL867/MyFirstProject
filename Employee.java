public class Employee {
	private String name,email;
	
	public  Employee()
	{
		System.out.println("i am a constter");
		name="payal defalut";
		email="default email";
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
