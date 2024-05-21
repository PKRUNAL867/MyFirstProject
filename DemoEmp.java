import java.util.*;
public class DemoEmp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name:=");
		String name=sc.next();
		System.out.println("Enter the email");
		String  email=sc.next();
		
		Employee e1=new Employee();
		e1.setName(name);
		e1.setEmail(email);
		System.out.println(e1.getName());
		System.out.println(e1.getEmail());
	
		

	}

}
