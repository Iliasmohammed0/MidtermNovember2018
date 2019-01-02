package datastructure;

import com.mongodb.client.MongoDatabase;
import databases.ConnectToMongoDB;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> listA = new ArrayList<>();
		listA.add("New York");
		listA.add("LA");
		listA.add("Florida");

		List<String> listB = new ArrayList<>();
		listB.add("Brooklyn");
		listB.add("Los Angeles");
		listB.add("Miami");

		map.put("A", listA);
		map.put("B", listB);
		System.out.println("Retrieve data: ");
		Set<Map.Entry<String, List<String>>> st = map.entrySet();
		for(Map.Entry<String, List<String>> a: st){
			System.out.println(a.getKey() + ": " + a.getValue());
		}
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}
}
