package com.pluralsight;

public class Format {
    //Main Method
    public static void main(String[] args) {

        System.out.println(formatName("Larry", "Le"));
    }

    //formatName Method
    public static String formatName(String first, String last) {
        //Formatting the order of the name
        return last + " " + first;
    }
}
