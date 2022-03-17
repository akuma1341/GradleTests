package com.example.gradletests;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    public String saySomething(String value) {
        return value;
    }

    public String saySomething() {
        return "Hello";
    }
}
