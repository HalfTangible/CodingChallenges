package com.revature.week1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlmostPalindromeTest {
    AlmostPalindrome testObj;

    @BeforeEach
    void setup(){
        testObj = new AlmostPalindrome();
    }

    @Test
    void test1(){
        String testString = "abcdcbg";
        assertTrue(testObj.almostPalindrome(testString));
    }

    @Test
    void test2(){
        String testString = "abccia";
        assertTrue(testObj.almostPalindrome(testString));
    }

    @Test
    void test3(){
        String testString = "abcdaaa";
        assertFalse(testObj.almostPalindrome(testString));
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