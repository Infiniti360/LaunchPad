package ArrayLaunchPad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class AlternatePrimeNumberInRange {

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int primeRange;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number List size to check Prime Number");

		primeRange = sc.nextInt();

		List<Integer> primeList = new ArrayList<Integer>();

		for (int i = 2; i <= primeRange; i++) {

			if (isPrime(i)) {
				primeList.add(i);
			}

		}

		System.out.println("\nPrime List : ");

		for (int h : primeList) {
			System.out.print(h + " ");
		}

		System.out.println("\nAlternate Prime List : ");

		for (int k = 0; k < primeList.size(); k++) {
			if (k % 2 != 0)
				System.out.print(primeList.get(k) + " ");
		}

		System.out.println("\nFull Prime List : ");

		Iterator<Integer> it = primeList.iterator();

		while (it.hasNext()) {

			System.out.print(it.next() + " ");
		}

	}

}
