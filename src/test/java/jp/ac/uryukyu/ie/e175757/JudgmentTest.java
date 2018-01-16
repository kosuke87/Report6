package jp.ac.uryukyu.ie.e175757;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JudgmentTest {
    @Test
    void judge() {
        int a = 1;
        int b = 13;
        boolean test;
        if (a < b) {
            if (a < b || b < a) {
                if ((a == 1 || b == 1) && (a == 13 || b == 13)) {
                    if (a < b) {
                        test = true;
                        assertTrue(test);
                    }
                }
            }
        }
    }
}