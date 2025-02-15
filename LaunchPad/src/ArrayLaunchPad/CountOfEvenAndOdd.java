package ArrayLaunchPad;

// Write a Java program to count the number of even and odd elements in a given array of integers.
public class CountOfEvenAndOdd {

	static int evenCounter = 0;

	public static Integer evenCounter(int _numberList[]) {
		for (int i : _numberList) {
			if (i % 2 == 0)
				++evenCounter;
		}
		return evenCounter;

	}

	public static void main(String[] args) {

		int numberList[] = { 1, 2, 3, 4, 5, 6, 7 };

		int evenCount = evenCounter(numberList);
		System.out.println("Even Count " + evenCount);
		System.out.println("Odd Count " + (numberList.length - evenCount));

	}

}
