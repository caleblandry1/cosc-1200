package week4.day2;

import java.util.Objects;
import java.util.Scanner;

public class pattern_printing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int triangle;

        String choice;
        //program execution loop
        do {

            do {
                System.out.println("pick a triangle");
                System.out.println("1. right angled triangle");
                System.out.println("2. inverted right angled triangle");
                System.out.print("enter your choice: ");
                triangle = sc.nextInt();
            } while (triangle != 1 && triangle != 2);

            int rows;
            do {
                System.out.print("Enter the number of rows (3-10):  ");
                rows = sc.nextInt();
            } while (rows > 3 && rows < 10);

            switch (triangle) {
                case 1:
                    //right angled triangle
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.println("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    //inverted right-angled triangle
                    for (int i = rows; i <= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.println("*");
                        }
                        System.out.println(" ");
                    }
                    break;
            }

            System.out.println("do you want to run the program again(yes or no)?");
            choice = sc.next();


        } while(Objects.equals(choice, "yes"));
    }
}
