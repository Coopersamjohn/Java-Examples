package example1;

public class Main {

	public static void main(String[] args) {

		AbcEmployee abc=new AbcEmployee();
		
		XyzEmployee xyz=new XyzEmployee();
		
		abc.addEmployee();
		abc.calculateEmployeeSalary();
		abc.commonEmplyeeBenefits();
		abc.localAbcEmpBenefits();
		// from Ems abstract class
		abc.updateEmployeeDetails();
		abc.getEmployee();
		System.out.println(abc.hashCode());
		
		System.out.println("Now accessing EMS with XyzEmployee oject");
		xyz.addEmployee();
		xyz.calculateEmployeeSalary();
		xyz.commonEmplyeeBenefits();
		xyz.getEmployee();
		xyz.updateEmployeeDetails();
		System.out.println(xyz.hashCode());
		

	}

}
