package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below

        //Bubble Sort Unit test
        try{
            int[] actual = sort.bubbleSort(unSortedArray);
            System.out.println("Test Passed: Quick Sort is sorted");
        }catch (AssertionError ex){
            System.out.println("Test failed: Quick Sort is not sorted");
        }

        //Quick Sort Unit test
        try{
            int[] actual = sort.quickSort(unSortedArray, 0 ,unSortedArray.length-1);
            System.out.println("Test Passed: Quick Sort is sorted");
        }catch (AssertionError ex){
            System.out.println("Test failed: Quick Sort is not sorted");
        }

        //Bucket Sort Unit test
        try{
            int[] actual = sort.bucketSort(unSortedArray, 10);
            System.out.println("Test Passed: Bucket Sort is sorted");
        }catch (AssertionError ex){
            System.out.println("Test failed: Bucket Sort is not sorted");
        }

        //Heap Sort Unit test
        try{
            int[] actual = sort.heapSort(unSortedArray);
            System.out.println("Test Passed: Heap Sort is sorted");
        }catch (AssertionError ex){
            System.out.println("Test failed: Heap Sort is not sorted");
        }

        //Merge Sort Unit test
        try{
            int[] actual = sort.mergeSort(unSortedArray, 0 ,unSortedArray.length-1);
            System.out.println("Test Passed: Merge Sort is sorted");
        }catch (AssertionError ex){
            System.out.println("Test failed: Merge Sort is not sorted");
        }

        //Insertion Sort Unit test
        try{
            int[] actual = sort.insertionSort(unSortedArray);
            System.out.println("Test Passed: Insertion Sort is sorted");
        }catch (AssertionError ex){
            System.out.println("Test failed: Insertion Sort is not sorted");
        }

    }
}
