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

        System.out.println("The last digit of number is: "+number%10);
    }
}
