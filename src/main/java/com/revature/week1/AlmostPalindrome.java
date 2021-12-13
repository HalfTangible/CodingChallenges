package com.revature.week1;

public class AlmostPalindrome {
    /*
     * Seems easy enough.
     * Set up a function to test if the word is a palindrome.
     * Stop at the midpoint.
     * Allow for 1 mismatch.
     * */
    public boolean almostPalindrome(String word){

        boolean hasMismatch = false;
        // 0 1 2 - only have to check to 1
        // 2 1 0

        // 0 1 2 3 //need to check to 1, not 2
        // 3 2 1 0

        //So if it's even we need to check to the halfway point - 1, and if odd, then the divide will do.

        int halfway = 0;

        if(word.length() % 2 == 1)
            halfway = word.length() / 2;
        else if(word.length() % 2 == 0)
            halfway = word.length() / 2 - 1;
        //length = 4, 5
        //halfway needs to be: 1, 2
        //0, 1, 2, 3
        //3, 2, 1, 0
        //0, 1, 2, 3, 4
        //4, 3, 2, 1, 0

        for(int i = 0; i < halfway; i++){ //halfway = 2, 2
            if(word.charAt(i) != word.charAt(word.length()-1-i) && !hasMismatch) //0, 1, 2
                hasMismatch = true;
            else if(word.charAt(i) != word.charAt(word.length()-1-i) && hasMismatch)
                return false;

        }


        return true;
    }
}


/*Coding Exercise 1. Almost - Palindrome
A string is an almost-palindrome if, by changing only one character, you can make it a palindrome. Create a function that returns true if a string is an almost-palindrome and false otherwise.

Examples
almostPalindrome("abcdcbg") ➞ true
// Transformed to "abcdcba" by changing "g" to "a".
almostPalindrome("abccia") ➞ true
// Transformed to "abccba" by changing "i" to "b".
almostPalindrome("abcdaaa") ➞ false
// Can't be transformed to a palindrome in exactly 1 turn.

almostPalindrome("1234312") ➞ false
*/

