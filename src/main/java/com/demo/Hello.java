package com.demo;

public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello SonarQube");

        // Code smell 1: unused variable
        int temp = 10;

        // Code smell 2: hardcoded value
        if (5 == 5) {
            System.out.println("Always true condition");
        }

        // Code smell 3: empty catch block
        try {
            int x = 10 / 1;
        } catch (Exception e) {
            // empty catch (bad practice)
        }
    }
}
