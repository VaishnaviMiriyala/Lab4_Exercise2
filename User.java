package m6.task4;
import java.util.Scanner;
import m6.task3.*;
public class User{
	public static void main(String args[]) {
		
		EmployeeService es = new EmployeeService();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the User id");
		int id = Integer.parseInt(sc.nextLine());
		es.setId(id);
		System.out.println("Enetr the user name");
		String name = sc.nextLine();
		es.setName(name);
		System.out.println("Enetr the user salary");
		double sal = Double.parseDouble(sc.nextLine());
		es.setSalary(sal);
		System.out.println("Enetr the user designation");
		String des = sc.nextLine();
		es.setDesignation(des);
		//es.getEmployeeDetails();
		
		es.displayEmpDetails();
		System.out.println("Insurance Eligibility: ");
		es.findInsuranceschema(sal);
	}
}