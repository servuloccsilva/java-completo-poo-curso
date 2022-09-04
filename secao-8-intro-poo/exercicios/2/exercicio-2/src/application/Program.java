package application;

import java.util.Locale;
import java.util.Scanner;

import util.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the employee info: ");
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		
		System.out.println("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee);
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		
		employee.increaseSalary(percentage);
		
		System.out.printf("Updated data: " + employee);
		
		
		sc.close();

	}

}
