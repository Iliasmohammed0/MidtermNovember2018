package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        int min =array1[0];
        for(int a =0; a<array1.length; a++){
            for(int b=0; b<array2.length; b++){
                int difference = Math.abs(array1[a]-array2[b]);
                if (difference<min) min = difference;}
            }
        System.out.println(min);
    }

}
