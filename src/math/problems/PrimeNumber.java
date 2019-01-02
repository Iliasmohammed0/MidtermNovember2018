package math.problems;
import databases.ConnectToMongoDB;
import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) throws Exception {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		List<Integer> arrayprime = new ArrayList<>();
		for (int a = 2; a <= 100; a++) {
			for (int c = 2; c <= a; c++) {
				if (c == a) {
					System.out.println(a);
				}
				if (a % c == 0)
					break;
			}
		}
		List list = arrayprime;
		ConnectToSqlDB sql = new ConnectToSqlDB();
		sql.insertDataFromArrayListToSqlTable(list, "PrimeNumber", "Numbers");
		sql.readDataBase("PrimeNumber", "Numbers");
		ConnectToMongoDB connectToMongoDB = new ConnectToMongoDB();
		connectToMongoDB.insertIntoMongoDB(list,"PrimeNumbers");
		connectToMongoDB.readStudentListFromMongoDB("PrimeNumbers");
	}
}

