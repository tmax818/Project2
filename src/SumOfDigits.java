/*
 * Project #2
 * Source Code File: SumOfDigits.java
 * Programmer: Tyler Maxwell
 * Due: 9/25/19
 * Description: A program that prompts a user for an integer between 1 and 999 and returns the sum of the digits of the
 * number provided.
 */

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 999 ");
        int number = input.nextInt();
        int digit1 = number / 100;
        int digit2 = number % 100 / 10;
        int digit3 = number % 100 % 10;

        System.out.println("The sum of all the digits in " + number + " are " + (digit1 + digit2 + digit3));
    }
}
