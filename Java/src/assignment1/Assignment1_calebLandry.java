/*
Name: Caleb Landry
Program: cosc-1200
Date: Tuesday, may 28th 2024
Description: A program that calculates the total distance covered by an object based on user input
 */

package assignment1;

//Importing math for absolute numbers
import java.lang.Math;
import java.util.Scanner;

public class Assignment1_calebLandry {
    public static void main(String[] args) {

        //Prompting the user for the initial angle of the projectile
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the initial angle of the projectile");
        double angle = sc.nextDouble();

        //making the user input an absolute number(removing any signs like "-")
        double angleAbsolute = Math.abs(angle);
        double finalAngle = Math.toDegrees(angleAbsolute);

        //asking the user for the initial velocity of the projectile
        System.out.println("please enter the initial velocity of the projectile");
        double velocity = sc.nextDouble();
        double velocityAbsolute = Math.abs(velocity);

        //assigning the value of gravity to a variable
        double gravity = 9.8;

        //calculating and printing the final distance covered
        double maxDistance = (velocityAbsolute * velocityAbsolute * Math.sin(2 * finalAngle)) / gravity;
        System.out.printf("the Final distance covered is: %.3f ", maxDistance);
    }
}
