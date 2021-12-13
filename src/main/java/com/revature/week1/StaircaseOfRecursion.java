package com.revature.week1;

public class StaircaseOfRecursion {

    public int waysToClimb(int n) {

        //if it's 0 or 1 we already know the answer is 1 and there's no point in even making a tree.
        if(n == 0 || n == 1)
            return 1;

        Node theTree = new Node(n);

        return theTree.count;
    }

    public static class Node{
        int height;
        int target;
        int count;
        Node left;
        Node right;

        public Node(int target){
            this.target = target;
            height = 0;
            count = 0;
            left = new Node(target, height+1);
            right = new Node(target, height+2);
            count = left.count + right.count;
        }

        public Node(int target, int height){
            if(target == height)
                count = 1; //If we get here then there's no need to make a new node at all, either because the next would hit the target or because we already have.
            else if(target > height){
                left = new Node(target, height+1);
                right = new Node(target, height+2);
                count = left.count + right.count;
            }
        }
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

/*
* A binary search tree could be useful here.
*
* Since you can only climb up 1 or 2 steps at a time, there's only two possible ways to go: +1 or + 2.
*
* Each node will keep a count of how far they are from the base.
*
* When we reach an end node on the tree (ie one that equals the number of stairs)
* we increase a global count variable by 1.
*
* When we've completed the tree, we return the count, and we have our answer.
*
* Problem: a static count variable is affected by previous tests, so that won't work.
*
* Solution: Instead of a global/static count variable, have a count in each node. Have it equal to the counts of the
* left and right node. If it's an endpoint node, the count is 1. This way, the count of each node will actually
* represent how many leaf notes there are on this branch of the tree.
*
* Therefore, the base node will have the full count!
* */