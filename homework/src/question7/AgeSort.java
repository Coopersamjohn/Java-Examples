package question7;

import java.util.Comparator;

public class AgeSort implements Comparator<Employee>{
	
	public int compare(Employee o1, Employee o2) {
		Employee e1=o1;
		Employee e2=o2;
		
		if (e1.getAge()>e2.getAge()) {
			return 1;
		} else if (e1.getAge()==e2.getAge()) {
			return 0;
		} else {
			return -1;
		}
	};
};
