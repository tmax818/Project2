/*
 * Project #2
 * Source Code File: RunwayLength.java
 * Programmer: Tyler Maxwell
 * Due: 9/25/19
 * Description:
 */

import java.util.Scanner;

public class RunwayLength {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed (meters/second): ");
        double speed = input.nextDouble();
        System.out.print("Enter rate of acceleration (meters/second^2): ");
        double acc = input.nextDouble();
        double length = (speed * speed) / ( 2 * acc);
        System.out.printf("The minimum runway length is %f50 meters", length);

    }
}
