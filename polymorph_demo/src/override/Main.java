package override;

public class Main {

	public static void main(String[] args) {

		MobileV2 v2=new MobileV2();
		v2.browsing();
		v2.calling();
		v2.gaming();
		v2.displayMenu();
		v2.texting();
		v2.videoCalling();
		System.out.println(v2.hashCode());

	}

}
