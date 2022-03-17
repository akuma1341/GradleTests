package com.example.gradletests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GradleTestsApplicationTests {

    @Autowired
    private HelloWorld helloWorld;

    @Test
    void helloWorldSaysHello() {
        String hello = helloWorld.saySomething();

        assertNotNull(hello);
        assertEquals("Hello", hello);
    }

    @Test
    void helloWorldSaysSomething() {
        String value = "something";
        String something = helloWorld.saySomething(value);
        System.out.println(something);

        assertEquals(value, something);
    }

}
