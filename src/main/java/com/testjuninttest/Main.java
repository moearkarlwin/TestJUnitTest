package com.testjuninttest;

public class Main {

    void display(String message) {
        IO.println("Hello " + message);
        IO.println("Hi " + message);
    }

    static void main() {
        Main m = new Main();
        m.display("Mg Mg");
    }
}
