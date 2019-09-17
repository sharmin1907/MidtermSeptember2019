package string.problems;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        //object of string class
        String original, reverse="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a string to check if it,s palindrome");
        original=scanner.nextLine();

        int length=original.length();
        for(int i=length-1;i>=0;i--){
        reverse=reverse+original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("The string is a palindrome");
        }else {
            System.out.println("The string is not a palindrome");
        }

    }
}
