package object_arrays;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of employees");
		int size=scanner.nextInt();
		// creates array, not employee object
		Employee employeeList[]=new Employee[size];
		for (int i = 0; i < employeeList.length; i++) {
			System.out.println("Enter details of employee - "+(i+1));
			System.out.println("Enter id");
			int id=scanner.nextInt();
			System.out.println("Enter Name");
			String name=scanner.next();
			System.out.println("Enter Age");
			int age=scanner.nextInt();
			System.out.println("Enter City");
			String city = scanner.next();
			
			employeeList[i]=new Employee(id, name, age, city);
			
		}
		
		printEmployees(employeeList);
		
		int ch=0;
		
		do {
			System.out.println("Search Employee Menu");
			System.out.println("-------------------------");
			System.out.println("1) By Id");
			System.out.println("2) By Name");
			System.out.println("3) By Age");
			System.out.println("4) By City");
			System.out.println("5) Exit");
			System.out.println("Enter Your Choice (1-5)");
			ch=scanner.nextInt();
			
			switch (ch) {
			case 1: System.out.println("Enter id to get employee details");
				int id=scanner.nextInt();
				Employee employee=getEmployeeById(employeeList, id);
				if(employee==null) {
					System.out.println("Employee with id "+id+" not found");
				} else {
					System.out.println("Employee with id "+id+" found, the details are");
					System.out.println("Id = "+employee.getId());
					System.out.println("Name = "+employee.getName());
					System.out.println("Age = "+employee.getAge());
					System.out.println("City = "+employee.getCity());
				}
				
				break;
			case 2:
				System.out.println("Under Construction");
				break;
			case 3:
				System.out.println("Under Construction");
				break;
			case 4:
				System.out.println("Enter City name to get employees in that city");
				String city=scanner.next();
				Employee searchList[]=getEmployeesByCity(employeeList, city);
				if(searchList[0]==null) {
					System.out.println("No employees found from that city"+city);
				} else {
					System.out.println("Printing employees from that city "+city);
					printEmployees(searchList);
				}
				break;
			case 5:
				System.out.println("Thanks for using");
				break;
			default: 
				System.out.println("Try another option");
				break;
			}
		}while(ch !=5);
		
		
		
		scanner.close();
		
	}
	
	public static void printEmployees(Employee[] employeeList) {
		
		System.out.println("Printing details of "+employeeList.length+" no of employee/s");
		for (int i = 0; i < employeeList.length; i++) {
			if(employeeList[i]==null) {
				continue;
			}
			System.out.println("The details of employee - " + (i + 1));
			System.out.println("Id = "+employeeList[i].getId());
			System.out.println("Name = "+employeeList[i].getName());
			System.out.println("Age = "+employeeList[i].getAge());
			System.out.println("City = " + employeeList[i].getCity()+"\n\n");
		}
	}
	
	public static Employee getEmployeeById(Employee[] employeeList, int id) {
		Employee employee=null;
		for (int i = 0; i < employeeList.length; i++) {
			if (employeeList[i].getId()==id) {
				employee = employeeList[i];
				break;
			}
		}
		return employee;
	}
	
	public static Employee[] getEmployeesByCity(Employee[] employeeList, String city) {
		Employee searchList[] = new Employee[employeeList.length];
		int c=0;
		for (int i = 0; i < searchList.length; i++) {
			if(employeeList[i].getCity().equals(city)) {
				searchList[c++]=employeeList[i];
			}
		}
		return searchList;
	}

}