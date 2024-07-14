package InterviewLaunchPad;

public class Car extends Automobile {
	static {
		System.out.println("Hello this is a static block: Car");
	}

	Car() {
		System.out.println("Hello this a constructor: Car");
	}

	public static void drive() {
		System.out.println("Hello this is an instance method: Car");
	}

	public static void main(String args[]) {
		new Car().drive();
		new Automobile().drive();
	}
}