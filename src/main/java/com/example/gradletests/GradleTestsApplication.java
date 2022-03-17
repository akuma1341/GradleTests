package com.example.gradletests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GradleTestsApplication {

    public static void main(String[] args) {
        ApplicationContext context =SpringApplication.run(GradleTestsApplication.class, args);

        HelloWorld helloWorld = context.getBean(HelloWorld.class);

        if (args.length > 0) {
            String value = args[0];
            System.out.println(helloWorld.saySomething(value));
        } else {
            System.out.println(helloWorld.saySomething());
        }

    }

}
