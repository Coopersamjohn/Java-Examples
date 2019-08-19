package question7;

import java.util.Comparator;

public class DepartmentSort implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		Employee e1=o1;
		Employee e2=o2;
		
		return e1.getDepartment().compareTo(e2.getDepartment());
	}
}
