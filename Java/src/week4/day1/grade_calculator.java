package week4.day1;

import java.util.Scanner;

public class grade_calculator {

    //week 4 day 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student score: ");
        double score = scanner.nextDouble();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score. " +
                    "Please enter a number between 0 and 100");
            return;
        }

        //Determine letter grade using if-else containers
        char grade;
        if (score >= 80){
            grade = 'A';
        } else if (score >= 70){
            grade = 'B';
        } else if (score >= 60){
            grade = 'C';
        } else if (score >= 50){
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Your grade is " + grade);

        //switch statement for feedback
        switch (grade){
            case 'A':
                System.out.println("Excellent work! keep it up");
                break;
            case 'B':
                System.out.println("Good job but there's some room for improvement");
                break;
            case 'C':
                System.out.println("Satisfactory, but you can do better");
                break;
            case 'D':
                System.out.println("You need to work harder");
                break;
            case 'F':
                System.out.println("unfortunately, you've failed " +
                        "consider revisiting the topics");
                break; //optional break
        }
    }
}
