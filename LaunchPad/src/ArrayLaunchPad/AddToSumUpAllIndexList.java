package ArrayLaunchPad;

import java.util.ArrayList;
import java.util.HashMap;

public class AddToSumUpAllIndexList {

	private static ArrayList<int[]> twoSum(int num[], int target) {

		HashMap<Integer, Integer> map = new HashMap<>();

		ArrayList<int[]> list1 = new ArrayList<int[]>();

		for (int i = 0; i < num.length; i++) {
			int complement = target - num[i];

			if (map.containsKey(complement)) {
				int[] keyIndex = new int[] { map.get(complement), i };
				list1.add(keyIndex);
			}
			map.put(num[i], i);
		}

		return list1;
	}

	public static void main(String[] args) {
		int numberList[] = { 1, 2, 3, 4, 5, 6, 7 };
		int target = 7;

		ArrayList<int[]> list2 = twoSum(numberList, target);

		System.out.println("The Array index which bring sum of two values to the target are mentioned below");

		System.out.println("index_1, index_2  => value_1 and value_2");

		for (int[] j : list2) {
			System.out.println(j[0] + ", " + j[1] + " => " + numberList[j[0]] + " and " + numberList[j[1]]);
		}

	}

}
