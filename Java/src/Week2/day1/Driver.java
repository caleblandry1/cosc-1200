/*
Name: Caleb Landry
Course: Cosc 1200
Date: May 24 2024
Description:
*/

package Week2.day1;

import java.util.Date;

public class Driver {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        User batman = new User("Bruce", "wayne", new Date(1980, 1, 1));

        System.out.println("First Name: " + batman.getFirstname());
    }
}
