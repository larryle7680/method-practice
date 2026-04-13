package com.pluralsight;

public class CompareNumbers {

    //Main Method
    public static void main(String[] args) {

       isEven(8);

    }
    //isEven Method

    public static int isEven(int numbers){
        if (numbers %2 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        return numbers;

    }
}
