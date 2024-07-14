package InterviewLaunchPad;

public class Automobile {

	static {

		System.out.println("Hello this is a static block: Automobile");

	}

	Automobile() {

		System.out.println("Hello this a constructor: Automobile");

	}

	public static void drive() {

		System.out.println("Hello this is an instance method: Automobile");

	}

}
