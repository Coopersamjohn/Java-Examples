package question7;

public class ObjectSortMain {

	public static void main(String[] args) {

		Employee e1=new Employee("Bob", "IT", 24);
		Employee e2=new Employee("Steve","HR", 23);
		
		System.out.println("Now sorting employees by name");
		NameSort ns=new NameSort();
		System.out.println(ns.compare(e1,e2));
		
		System.out.println("Now sorting employees by department");
		DepartmentSort ds=new DepartmentSort();
		System.out.println(ds.compare(e1,e2));
		
		System.out.println("Now sorting employees by age");
		AgeSort as=new AgeSort();
		System.out.println(as.compare(e1,e2));

	}

}
