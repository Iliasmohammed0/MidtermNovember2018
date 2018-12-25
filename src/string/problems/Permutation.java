package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("", "abc");
    }
    public static  void permutation(String a, String b){
        int c = b.length();
        if(c==0) {
            System.out.println(a);
        }else{
            for(int d=0;d<c;d++){
                permutation(a + b.charAt(d), b.substring(0,d)+ b.substring(d+1,c));
            }
        }
    }
}
