package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
    String original ="";
    String reverse="";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String to see of string is palindrome: ");
        original = scan.nextLine();
        int length = original.length();
        for (int a = length-1;a>=0;a--)
            reverse = reverse+original.charAt(a);
        if(original.equals(reverse))
            System.out.println("String is a palindrome: ");
        else
            System.out.println("String isnt a palindrome: ");
    }
}
