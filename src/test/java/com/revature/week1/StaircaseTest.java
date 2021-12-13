package com.revature.week1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaircaseTest {

    StaircaseOfRecursion stair;

    @BeforeEach
    void setUp(){
        stair = new StaircaseOfRecursion();
    }

    @Test
    void test0(){
        int n = 0;
        int expected = 1;
        int actual = stair.waysToClimb(n);
        assertEquals(expected, actual);
    }

    @Test
    void test1(){
        int n = 1;
        int expected = 1;
        int actual = stair.waysToClimb(n);
        assertEquals(expected, actual);
    }

    @Test
    void test2(){
        int n = 2;
        int expected = 2;
        int actual = stair.waysToClimb(n);
        assertEquals(expected, actual);
    }

    @Test
    void test5(){
        int n = 5;
        int expected = 8;
        int actual = stair.waysToClimb(n);
        assertEquals(expected, actual);
    }
}

/*
Coding Exercise 2. Staircase of Recursion
Write a function that returns the number of ways a person can climb n stairs, where the person may only climb 1 or 2 steps at a time.

To illustrate, if n = 4 there are 5 ways to climb:

[1, 1, 1, 1]
[2, 1, 1]
[1, 2, 1]
[1, 1, 2]
[2, 2]
Examples
waysToClimb(1) ➞ 1
waysToClimb(2) ➞ 2
waysToClimb(5) ➞ 8

Notes
A staircase of height 0 should return 1.*/