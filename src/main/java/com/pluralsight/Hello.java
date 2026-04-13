package com.pluralsight;
import java.util.Scanner;
public class Hello {
    //Creating my scanner
    static Scanner theScanner = new Scanner(System.in);

    //Main method
    public static void main(String[] args) {
        sayHello();
        sayGoodBye();
        sayGoodMorning();
    }

    //Say Hello Method
    public static void sayHello() {
        System.out.println("Hello, World");
    }

    //sayGoodBye Method
    public static void sayGoodBye() {
        System.out.println("Goodbye, World");
    }

    //sayGoodMorning Method
    public static void sayGoodMorning() {
        System.out.println("Good, Morning!");
    }

    //
}
