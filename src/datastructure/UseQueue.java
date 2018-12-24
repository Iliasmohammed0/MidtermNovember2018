package datastructure;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> warriors = new LinkedList<String>();
		warriors.add("Green");
		warriors.add("Iggy");
		warriors.add("Thompson");
		warriors.add("Durant");
		warriors.add("Curry");
		System.out.println("Size of Queue: " + warriors.size());
		System.out.println("Head of the Queue: " + warriors.peek());
		System.out.println("Before removal: ");
		for(String a:warriors){
			System.out.println(a);
		}
		warriors.remove();
		warriors.remove();
		System.out.println("Size of Queue: " + warriors.size());
		System.out.println("Head of the Queue: " + warriors.element());
		Iterator it = warriors.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
			}
}
