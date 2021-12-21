package com.revature.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PronicTest {

    PronicNumber pronicNumber;

    @BeforeEach
    void setUp(){
        pronicNumber = new PronicNumber();
    }

    @Test
    void zero(){
        assertTrue(pronicNumber.isHeteromecic(0));
    }

    @Test
    void two(){
        assertTrue(pronicNumber.isHeteromecic(2));
    }

    @Test
    void seven(){
        assertFalse(pronicNumber.isHeteromecic(7));
    }

    @Test
    void hundredTen(){
        assertTrue(pronicNumber.isHeteromecic(110));
    }

    @Test
    void hundredThirtySix(){
        assertFalse(pronicNumber.isHeteromecic(136));
    }

    @Test
    void hundredFiftySix(){
        assertTrue(pronicNumber.isHeteromecic(156));
    }

}
/*Examples
isHeteromecic(0) ➞ true
// 0 (0 + 1) = 0 1 = 0

isHeteromecic(2) ➞ true
// 1 (1 + 1) = 1 2 = 2

isHeteromecic(7) ➞ false

isHeteromecic(110) ➞ true
// 10 (10 + 1) = 10 11 = 110

isHeteromecic(136) ➞ false

isHeteromecic(156) ➞ true*/