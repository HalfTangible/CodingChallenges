package com.revature.week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HappyTest {

    HappyNumber happyNumber;

    @BeforeEach
    void setUp(){
        happyNumber = new HappyNumber();
    }

    @Test
    void twoOhThree(){
        assertTrue(happyNumber.happy(203));
    }

    @Test
    void eleven(){
        assertFalse(happyNumber.happy(11));
    }

    @Test
    void oneOhSeven(){
        assertFalse(happyNumber.happy(107));
    }

    /*Examples:
happy(203) ➞ true

happy(11) ➞ false

happy(107) ➞ false*/
}
