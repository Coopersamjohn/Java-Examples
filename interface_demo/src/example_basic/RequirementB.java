package example_basic;

public interface RequirementB {

	void requirement4();
	void requirement5();
	void commonRequirement();
	
	int x=9; // final & static
	
	interface Inner {
		void innerRequirement();
	}

}
