package example_basic;

public class Main {

	public static void main(String[] args) {
		
		// Requirement B
		System.out.println("Accessing RequirementA");
		RequirementA a=new RequirementsImpl();
		a.commonRequirement();
		a.requirement1();
		a.requirement2();
		a.requirement3();
		System.out.println(a.hashCode());
		a.sayHello();
		RequirementA.hiStatic();
		
		// Requirement B
		System.out.println("Accessing RequirementB");
		RequirementB b=new RequirementsImpl();
		
		b.commonRequirement();
		b.requirement4();
		b.requirement5();
		System.out.println(b.hashCode());
		
		System.out.println("Accessing RequirementB.Inner");
		RequirementB.Inner i=new RequirementsImpl();
		i.innerRequirement();
		System.out.println(i.hashCode());

	}

}
