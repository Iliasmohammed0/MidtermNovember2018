package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
         int a = 1;
         int b = 0;
            for(int c=1; c<=40; c++){
            int sum = a + b;
            a=b;
            b = sum;
            System.out.println(sum + " ");
        }

    }
}
