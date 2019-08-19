package example_basic;

public class RequirementsImpl implements RequirementA, RequirementB, RequirementB.Inner {

	@Override
	public void requirement1() {

		System.out.println("Requirement 1 implemented");
		
	}

	@Override
	public void requirement2() {

		System.out.println("Requirement 2 implemented");
		
	}

	@Override
	public void requirement3() {

		System.out.println("Requirement 3 implemented");

		
	}

	@Override
	public void requirement4() {
		System.out.println("Requirement 4 implemented");
		
	}

	@Override
	public void requirement5() {
		System.out.println("Requirement 5 implemented");
		
	}

	@Override
	public void commonRequirement() {

		System.out.println("Common solution given");
		System.out.println("x = "+x);
		// x++; this can't be done because variables are final (const), can't be reassigned
		
	}
	
	@Override
	public void innerRequirement() {
		System.out.println("Inner requirement class from Inner interface nested in RequirementB");
	}
	
}
