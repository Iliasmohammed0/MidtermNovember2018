package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        int max=0;
        String maxWord="";
        for(Map.Entry<Integer,String>wordLength:wordNLength.entrySet()){
            if(max<wordLength.getKey()){
                max = wordLength.getKey();
                maxWord=wordLength.getValue();
            }
        }
        System.out.println("Longest word: "+maxWord);
        System.out.println("Length of word: "+max);
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement
        String[] array=wordGiven.split(" ");
        for(int a=0;+a<array.length;a++ ){
            map.put(array[a].length(), array[a]);
        }
        return map;
    }
}
