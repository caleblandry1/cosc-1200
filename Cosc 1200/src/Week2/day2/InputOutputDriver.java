package Week2.day2;

import java.util.Scanner;

public class InputOutputDriver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("please enter your age: ");
        int age = scanner.nextInt();
        System.out.println("hello " + name + ", you are " + age + " years old");

        double averageGrade = 82.999;
        System.out.printf("the average grade is: %.0f%n ", + averageGrade);





    }

}
