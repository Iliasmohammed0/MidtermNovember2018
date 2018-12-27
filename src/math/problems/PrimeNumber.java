package math.problems;

import databases.ConnectToMongoDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		for (int a = 2; a <= 1000000; a++) {
			for (int c = 2; c <= a; c++) {
				if (c == a) {
					System.out.println(a);
				}
				if (a % c == 0)
					break;
			}
		}
	}
}

