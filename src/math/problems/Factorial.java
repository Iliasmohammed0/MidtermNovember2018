package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        System.out.println("Using Recursion to to find factor of 5: " + factorialIncursion(5));
        System.out.println("Using Iteration to find factor of 5: " + factorialIteration(5));
    }
    //iterator
    public static int factorialIteration(int a) {
        int result = 1, i = 1;
        while (i <= a) {
            result = result * i;
            i++;
        }
        return result;
    }
    //Recursion
    public static int factorialIncursion(int a) {
        if (a <= 1) {
            return 1;
        }else{
            return a * factorialIncursion(a - 1);
        }
    }
}
