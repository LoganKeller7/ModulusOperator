package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        lastDigit();
    }
    public static void lastDigit(){

        int number;

        Scanner keyboard;
        keyboard = new Scanner (System.in);

        System.out.println("Name a positive number that is 4 digits long");
        number = keyboard.nextInt();
                value =10;
                System.out.println("Name a positive number");
                number= keyboard.nextInt();


                number = 1;
                System.out.println((number%5)+4);

                number = 2;
                System.out.println((number%5)+4);

                number = 3;
                System.out.println((number%5)+4);

        System.out.println("The last digit of number is: "+number%10);
                System.out.println((number%5)+4);

                number = 5;
                System.out.println((number%5)+4);

                number = 1;
                System.out.println((number%5)+4);

                number = 2;
                System.out.println((number%5)+4);

                number = 3;
                System.out.println((number%5)+4);

                number = 4;
                System.out.println((number%5)+4);

                number = 5;
                System.out.println((number%5)+4);


                System.out.println("number contained is: " + value);
    }
}
