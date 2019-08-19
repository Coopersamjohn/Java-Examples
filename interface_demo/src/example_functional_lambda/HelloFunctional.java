package example_functional_lambda;


@FunctionalInterface
public interface HelloFunctional {
	
	void hello();
	// void h1(); // this returns error because ONLY ONE METHOD IS ALLOWED!!
	// public & abstract

}

@FunctionalInterface
interface Sum{
	int add(int a,int b);
}

@FunctionalInterface
interface Hey{
	void hello(String name);
}
