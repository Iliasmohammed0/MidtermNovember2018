package datastructure;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<String> lakers = new ArrayList<String>();
		lakers.add("Ingram");
		lakers.add("James");
		lakers.add("Ball");
		lakers.add("Hart");
		lakers.add("Kuzma");
		lakers.add("McGee");
		System.out.println("Before Removing: ");
		System.out.println("laker list size: " + lakers.size());
		for (String a : lakers) {
			System.out.println(a);
		}
		lakers.remove(5);
		lakers.remove(3);
		Iterator it = lakers.listIterator();
		System.out.println("laker list size after removing: " + lakers.size());
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
