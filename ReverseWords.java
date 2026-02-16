package Recursion;

import java.util.*;

public class ReverseWords {

    public static String arrangeWords(String sentence) {


        sentence = sentence.toLowerCase();

        String[] words = sentence.split(" ");

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        words[0] = Character.toUpperCase(words[0].charAt(0)) + words[0].substring(1);

        return String.join(" ", words);
    }

    public static void main(String[] args) {

        String s1 = "Leetcode makes me happy";
        String s2 = "Keep calm and carry on";
        String s3 = "To be or not to be";

        System.out.println(arrangeWords(s1));
        System.out.println(arrangeWords(s2));
        System.out.println(arrangeWords(s3));
    }
}
