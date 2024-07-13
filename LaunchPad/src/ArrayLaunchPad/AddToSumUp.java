package ArrayLaunchPad;

import java.util.HashMap;

public class AddToSumUp {

	private static int[] twoSum(int num[], int target) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < num.length; i++) {
			int complement = target - num[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(num[i], i);
		}

		throw new IllegalArgumentException("No Solution");
	}

	public static void main(String[] args) {
		int numberList[] = { 1, 2, 3, 4, 5, 6, 7 };
		int target = 7;

		int indexList[] = twoSum(numberList, target);

		for (int j : indexList) {
			System.out.println(j);
		}

	}

}
