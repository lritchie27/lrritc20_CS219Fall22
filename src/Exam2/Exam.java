/*
    Logan Ritchie
    Exam 2 Practical
    11/01/2022
 */

package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Exam {

    public static String [] load_words(String path, int n) {
        // connect to the web page of speeds
        URL url = null;    // null is the nothing value
        Scanner s = null;

        try {
            url = new URL(path);  // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // create an array of strings
        String [] words = new String[n];

        int i = 0;
        while (s.hasNextLine()) {
            words[i++] = s.nextLine();
            // i++;
        }

        return words;
    }

    /*
        Reverse the string
     */
    public static String reverse(String s) {
        if (s.length() == 0)
            return "";
        else
            return reverse(s.substring(1)) + s.charAt(0);
    }

    /*
        Check if a string is a palindrome
     */
    public static boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }

    /*
        Reverse the order of an array
     */
    public static String [] reverse1(String [] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {

        String [] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                2309);

        // create new array of words to hold the palindromes
        String [] aow = new String[9]; // 9 words that are palindromes

        // to keep track of index in aow
        int j = 0;

        for (String word : words) {
            // check if word is a palindrome
            if (isPalindrome(word)) {
                // store in aow[] at index j
                aow[j] = word;
                // increase the index variable for aow
                j++;
            }
        }
        System.out.println("The alphabetical version of the palindromes:");
        System.out.println(Arrays.toString(aow));

        System.out.println();

        System.out.println("The reverse alphabetical version of the palindromes:");
        System.out.println(Arrays.toString(reverse1(aow)));

    }

}
