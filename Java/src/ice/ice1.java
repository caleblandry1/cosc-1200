/*
Name: Caleb Landry
Program: cosc-1200
Date: Tuesday, may june 13 2024
Description: A program that run multiple methods
 */

package ice;

public class ice1 {

    public static void main(String[] args) {

    }

    /**
     * this function prints the start equal to the Value of your parameter
     * @param n
     */
    public static void drawStars(int n) {
        for(int i = 0; 1 < n; i++) {
            System.out.println("*");


        }
        System.out.println();
    }


    public static void printStatement(String statement) {
        System.out.println(statement);
    }

    /**
     * this takes in two integers and returns their product
     * @param a
     * @param b
     * @return
     */

    public static double multiplyNumbers(double a, double b) {

        return a * b;
    }

    public static int multiplyNumbers(int a, int b) {

        return a * b;
    }


public static boolean isPalandrome(String str) {
        //convert all to lowercase
        str = str.toLowerCase();
        return isPalandrome(str, 0, str.length() - 1);
}

    /**
     * Method calls overloaded isPalandrom(), int, string
     * @param rightIndex
     * @param leftIndex
     * @return
     */
    private static boolean isPalandrome(String str, int leftIndex, int rightIndex) {

        //baseclass
        while (leftIndex < rightIndex) {
            leftIndex--;
        }

        return leftIndex == rightIndex;
    }

}
