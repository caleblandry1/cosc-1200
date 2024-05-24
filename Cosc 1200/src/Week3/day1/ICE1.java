/*
Name: Caleb Landry
Course: COSC 1200
Date: May 24 2024
Description: A program that states information about myself and asks for basic user input
*/
package Week3.day1;

import java.util.Scanner;

public class ICE1 {

    public static void main(String[] args) {
        System.out.printf("Caleb Landry, 100904940 %n'why so serious' - The joker in the dark knight%n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number between 50 and 999");
        double userNumber = scanner.nextDouble();

        if (userNumber >= 50 && userNumber <= 999) {
            System.out.println("the number you entered is " + userNumber + " and it is within the acceptable range of 50 and 999");

        } else {
            System.out.println("Alert, the number you entered is " + userNumber + " and it is not within the acceptable range of 50 and 999");
        }

    }
}
