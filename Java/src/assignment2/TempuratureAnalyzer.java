/*
Name: Caleb Landry
Program: cosc-1200
Date: Sunday, june 23 2024
Description: A program that analyzes temperature inputted.
 */

package assignment2;


import java.util.Scanner;

public class TempuratureAnalyzer {

    public static void main(String[] args) {

        //creating scanner for inputs
        Scanner scanner = new Scanner(System.in);

        //creating lists for high and low temperatures
        final int MAX_DAYS = 31;
        double[] lowTemps = new double[MAX_DAYS];
        double[] highTemps = new double[MAX_DAYS];

        //getting input for the number of days the user wants to input
        int days;
        while (true) {
            System.out.print("Enter the number of days (1-31): ");
            days = scanner.nextInt();
            if (days >= 1 && days <= 31) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 31.");
            }
        }

        //iterating over the temperature inputs until the user has given a range for every day
        for (int day = 0; day < days; day++) {
            while (true) {
                System.out.print("Enter the low temperature for day " + (day + 1) + " (-30 to 30): ");
                double lowTemp = scanner.nextDouble();

                System.out.print("Enter the high temperature for day " + (day + 1) + " (-30 to 30): ");
                double highTemp = scanner.nextDouble();

                if (lowTemp < -30 || lowTemp > 30) {
                    System.out.println("Invalid input. Temperatures must be between -30 and 30.");
                }
                else if (highTemp < -30 || highTemp > 30) {
                    System.out.println("Invalid input. Temperatures must be between -30 and 30.");
                }
                else if (lowTemp > highTemp) {
                    System.out.println("Invalid input. Low temperature cannot be higher than high temperature.");
                } else {
                    lowTemps[day] = lowTemp;
                    highTemps[day] = highTemp;
                    double dailyAverage = (lowTemp + highTemp) / 2.0;
                    System.out.printf("Average temperature for day %d: %.1f%n", day + 1, dailyAverage);
                    break;
                }
            }
        }

        //creating variables
        double totalLowTemp = 0;
        double totalHighTemp = 0;
        double overallAverage;
        double lowestTemp = lowTemps[0];
        double highestTemp = highTemps[0];
        int dayWithLowestTemp = 1;
        int dayWithHighestTemp = 1;

        //calculating the highest and lowest tempurature days
        for (int day = 0; day < days; day++) {
            totalLowTemp += lowTemps[day];
            totalHighTemp += highTemps[day];

            if (lowTemps[day] < lowestTemp) {
                lowestTemp = lowTemps[day];
                dayWithLowestTemp = day + 1;
            }
            if (highTemps[day] > highestTemp) {
                highestTemp = highTemps[day];
                dayWithHighestTemp = day + 1;
            }
        }

        //calculating the average temperature and outputting
        overallAverage = (totalLowTemp + totalHighTemp) / (2 * days);
        System.out.printf("Overall average temperature: %.1f%n", overallAverage);
        System.out.printf("Day with the lowest temperature: Day %d (%.1f)%n", dayWithLowestTemp, lowestTemp);
        System.out.printf("Day with the highest temperature: Day %d (%.1f)%n", dayWithHighestTemp, highestTemp);
    }
}
