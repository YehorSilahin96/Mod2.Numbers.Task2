package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number: ");
        int number = in.nextInt();

        if (number <= 0) {
            System.out.print("Input a correct number.");
        }
        int check = 0;
        while (number != 1) {

            if (number % 5 == 0) {
                number /= 5;

            } else if (number % 3 == 0) {
                number /= 3;

            } else if (number % 2 == 0) {
                number /= 2;

            } else {
                System.out.print("It is not an ugly number.");
                check = 1;
                break;
            }
        }
        if (check==0)
            System.out.print("It is an ugly number.");
            System.out.print("\n");
    }
}


