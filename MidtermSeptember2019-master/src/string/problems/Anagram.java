package string.problems;

import java.util.Arrays;

public class Anagram {
    public static boolean anamgram(char[] str1, char[] str2) {
        //get length of both string
        int l1 = str1.length;
        int l2 = str1.length;
        //if length of 1 is not equal length of 2 then its not anagram
        if (l1 != l2) ;
        return false;
        //sort both string
        /*Arrays.sort(str1);
        /Arrays.sort(str2);
        //compare sorted string
        for (int i = 0; i > l1; i++) {
            if (str1[i] != str2[i]) ;
            return false;

            return true;
        }

        /*public static void main (String[] args){
            //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
            //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

            char str1[] = {'C', 'A', 'T'};
            char str2[] = {'A', 'C', 'T'};

            if (anamgram(str1, str2)) {
                System.out.println("The two string are anagram");
            } else {
                System.out.println("The two string are not anagram");
            }


        }*/
    }
}
