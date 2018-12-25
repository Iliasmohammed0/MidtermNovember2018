package string.problems;

import java.util.HashMap;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    isAnagram("ARMY", "MARY");
    isAnagram("GIANTS", "FALCONS");
    }

    public static void isAnagram(String s1, String s2) {
        String copyOfs1 = s1.replaceAll("\\s","");
        String copyOfs2 = s2.replaceAll("\\s","");
    boolean status= true;
    if(copyOfs1.length() !=copyOfs2.length()){
        status = false;
    }else{
        HashMap<Character, Integer>map = new HashMap<Character, Integer>();
        for(int i=0; i < copyOfs1.length();i++){
            char charAsKey=copyOfs1.charAt(i);
            int charCountAsValue=0;
            if(map.containsKey(charAsKey)){
                charCountAsValue=map.get(charAsKey);
            }
            map.put(charAsKey, ++charCountAsValue);
            charAsKey=copyOfs2.charAt(i);
            charCountAsValue=0;
            if(map.containsKey(charAsKey)){
                charCountAsValue=map.get(charAsKey);
            }
            map.put(charAsKey, --charCountAsValue);}
        for(int value:map.values()){
            if(value!=0){
                status=false;
            }
        }
        }
    if(status){
        System.out.println(s1+" and "+s2+" are Anagrams");}
    else{
        System.out.println(s1+ " and "+s2+ " are not Anagrams " );}
    }
}