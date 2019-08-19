package question7;

import java.util.Comparator;

public class NameSort implements Comparator<Employee>{
	
	// Sort two employees based on their name, department, 
	// and age using the `Comparator` interface.

	@Override
	public int compare(Employee o1, Employee o2) {
		Employee e1=o1;
		Employee e2=o2;
		
		return e1.getName().compareTo(e2.getName());
	};
}
