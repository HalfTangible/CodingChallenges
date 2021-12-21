package com.revature.week2;

public class PronicNumber {

    public boolean isHeteromecic(int input){

        int num = (int) Math.sqrt(input);
        num = num * (num + 1);

        return input == num;
    }
/*
    public static void main(String[] args){
        int nine = 9;
        int ten = 10;

        System.out.println(Math.sqrt(nine)); //3.0
        System.out.println(Math.sqrt(ten)); //3.1622776601683795
        System.out.println( (int) Math.sqrt(ten)); //3.1622776601683795
    }*/
}

/*1) A pronic number (or otherwise called as heteromecic) is a number which is a product of two consecutive integers,
that is, a number of the form n(n + 1). Create a function that determines whether a number is pronic or not.

Examples
isHeteromecic(0) ➞ true
// 0 (0 + 1) = 0 1 = 0

isHeteromecic(2) ➞ true
// 1 (1 + 1) = 1 2 = 2

isHeteromecic(7) ➞ false

isHeteromecic(110) ➞ true
// 10 (10 + 1) = 10 11 = 110

isHeteromecic(136) ➞ false

isHeteromecic(156) ➞ true*/

//Idea 1: Take the square root, and floor it if it's not a whole number. That should be the first number, right?
//12*13 = 156
//Works with all of our examples, at least, and logically it makes sense.
