package com.example.gradletests;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GradleTestsApplicationTests {

    @Test
    void intSumEquals() {
        int a = 2 + 2;

        assertEquals(4, a);
    }

    @Test
    void stringsAreNotEqual() {
        String value = "something";
        String value2 = "somethingElse";

        assertNotEquals(value, value2);
    }

}
