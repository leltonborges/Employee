package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i=0; i < n; i++) {
			System.out.println("Employee #"+i+" data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hour = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePH = sc.nextDouble();
			if(ch == 'y' || ch == 'Y') {
				System.out.print("Additional Charge: ");
				double addCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hour, valuePH, addCharge));
			}else {
				list.add(new Employee(name, hour, valuePH));
			}
		}
		System.out.println("");
		System.out.println("PAYMENTS:");
		for(Employee e : list) {
			StringBuilder sb = new StringBuilder();
			sb.append("Name: "+ e.getName());
			sb.append(" - $ " + String.format("%.2f", e.payment()));
			System.out.println(sb.toString());
		}
		
		sc.close();
	}
}
