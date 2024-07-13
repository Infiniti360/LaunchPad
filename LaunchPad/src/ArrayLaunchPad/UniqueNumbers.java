package ArrayLaunchPad;

import java.util.HashMap;

/*Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct. */

public class UniqueNumbers {

	public static void main(String[] args) {
		int numberList[] = { 1, 2, 4, 4, 4, 6, 7 };

		HashMap<Integer, Integer> Mode = new HashMap<Integer, Integer>();

		for (int i : numberList) {
			int count = 1;
			Mode.put(i, Mode.containsKey(i) ? ++count : count);
		}

		System.out.println(Mode.toString());

		int duplicateCounter = 0;

		for (int i : numberList) {
			if (Mode.get(i) > 1) {
				duplicateCounter++;
			}

		}

		if (duplicateCounter > 0) {
			System.out.println("Duplicate Elements present in the List with Count :" + duplicateCounter);
		} else {
			System.out.println("Duplicate Elements is not present in the List");
		}

	}

}
