package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */
		String textFile = "C:/PNTNY/MidtermNovember2018/src/data/self-driving-car";
		BufferedReader br = null;
		FileReader fr = null;
		String store = "";
		String data = "";
		try {
			fr = new FileReader(textFile);
			System.out.println("Found File");
		} catch (FileNotFoundException e) {
			System.out.println("File was not found...");
		}
		try {
			br = new BufferedReader(fr);
			while ((data = br.readLine())!= null) {
				System.out.println(data);
				store += data;
			}
		} catch (Exception ex) {
			System.out.println("Not able to read file...");
		}
		String[] array = store.split(" ");
		Stack<String> stack = new Stack<>();
		List<String> list  =new LinkedList<>();

		for(String a:array){
			list.add(a);
			stack.push(a); }
		System.out.println("\nLink FIFO: ");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		System.out.println("\nStack LIFO: ");
		while(!stack.isEmpty()){
			System.out.println(stack.pop() + " ");
		}
	}
}
