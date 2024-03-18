package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int quantidade = sc.nextInt();
		
		for (int qemployee = 0; qemployee < quantidade; qemployee++) {
			
			System.out.println("Employee #" + (qemployee+1) + " data");
			
			System.out.print("Name: ");
			
			if (qemployee == 0) {
				sc.nextLine();
			}
			
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			System.out.print("Outsourced: ");
			sc.nextLine();
			String cond = sc.nextLine();
			cond.toLowerCase();
			
			if (cond.equals("n")) {
				Employee employee = new Employee(name, hours, valuePerHour);
				employees.add(employee);
			}else if (cond.equals("y")){
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				sc.nextLine();
				Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(employee);
			}else {
				System.out.println("Invalid operation");
			}
		}
		
		for (Employee e : employees) {
			System.out.println(e.toString());
		}

	}

}
