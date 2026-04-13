package com.pluralsight;

public class CompareNumbers {

    //Main Method
    public static void main(String[] args) {

       isEven(8);
       isPositive(-4);
       isPositive(56);

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

    //isPositive method
    public static int isPositive(int numbers){
        if( numbers > 0){
            System.out.println("This number is postive");
        }else{
            System.out.println("This number is negative");
        }
        return numbers;
    }
}
