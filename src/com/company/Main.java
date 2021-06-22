package com.company;

import java.util.Scanner;

public class Main {

    public static final String notUgly = "It's not an ugly number";
    public static final String ugly = "It's an ugly number";

    public static void main(String[] args) {
        //initialization
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number: ");
        int number = in.nextInt();

        if (number <= 0) {
            System.out.print("Input a correct number.");
        } else {
            System.out.println(checkUglyNumber(number));
        }
    }

    // Method for checking our numbers
    public static String checkUglyNumber(int number) {
        while (number != 1) {
            if (number % 5 == 0) {
                number /= 5;
            } else if (number % 3 == 0) {
                number /= 3;
            } else if (number % 2 == 0) {
                number /= 2;
            } else {
                return notUgly;
            }
        }
        return ugly;
    }
}

