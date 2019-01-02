package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[10];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
      	List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
		System.out.println("Selection Sort:");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);

		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumbers");
		List<String> numbersIS = connectToSqlDB.readDataBase("insertion_sort", "SortingNumbers");
		System.out.println("Insertion Sort:");
		printValue(numbersIS);
		int nIS = num.length;
		randomize (num, nIS);
		//By following above, Continue for rest of the Sorting Algorithm....

		//Bubble Sort
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumbers");
		List<String> numbersBS = connectToSqlDB.readDataBase("insertion_sort", "SortingNumbers");
		System.out.println("Bubble Sort:");
		printValue(numbersBS);
		int nBS = num.length;
		randomize (num, nBS);

		//MergeSort
		algo.mergeSort(num, 0 ,  n-1);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "SortingNumbers");
		List<String> numbersMS = connectToSqlDB.readDataBase("merge_sort", "SortingNumbers");
		System.out.println("Merge Sort:");
		printValue(numbersMS);
		int nMS = num.length;
		randomize (num, nMS);
		//Come to conclusion about which Sorting Algo is better in given data set.

		//QuickSort
		algo.quickSort(num, 0 ,n-1);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + quickSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_sort", "SortingNumbers");
		List<String> numbersQS = connectToSqlDB.readDataBase("quick_sort", "SortingNumbers");
		System.out.println("Quick Sort:");
		printValue(numbersQS);
		int nQS = num.length;
		randomize (num, nQS);

		//HeapSort
		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + heapSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "heap_sort", "SortingNumbers");
		List<String> numbersHS = connectToSqlDB.readDataBase("heap_sort", "SortingNumbers");
		System.out.println("Heap Sort:");
		printValue(numbersHS);
		int nHS = num.length;
		randomize (num, nHS);

		//BucketSort
		algo.bucketSort(num, 20);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucket_sort", "SortingNumbers");
		List<String> numbersBS2 = connectToSqlDB.readDataBase("bucket_sort", "SortingNumbers");
		System.out.println("Bucket Sort:");
		printValue(numbersBS2);
		int nBS2 = num.length;
		randomize (num, nBS2);

		//ShellSort
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Shell Sort take: " + shellSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "Shell_sort", "SortingNumbers");
		List<String> numbersSS = connectToSqlDB.readDataBase("Shell_sort", "SortingNumbers");
		System.out.println("Shell Sort:");
		printValue(numbersSS);
		int nSS = num.length;
		randomize (num, nSS);

	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(20);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
