package week5.day1;

public class ArrayExercise {
    public static void main(String[] args) {

        //define an integer array

        int[] number = {10, 20, 30, 40, 50};
        System.out.println("Original array: " + arrayToString(number));

        //function to reverse contents of array
        reverse(number);
        System.out.println("reversed array: " + arrayToString(number));

        double average = arrayAverage(number);

        System.out.println("average array: " + average);


    }

    /**
     * Function accepts an int array and converts it to a string
     * @param array
     * @return String
     */
    public static String arrayToString(int[] array) {

        StringBuilder sb = new StringBuilder("[ ");
        for (int i : array) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(" ");
            }
        }
        sb.append(" ]");
        return sb.toString();

    }

    //function to reverse something

    /**
     *
     * @param array
     */
    public static void reverse(int[] array) {

        int start = 0;
        int end = array.length - 1;

        while(start < end){
            int temp = array[start]; //10
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    //average of an array

    /**
     * Function accepts array and returns average
     * @param array
     * @return
     */
    public static double arrayAverage(int[] array) {

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }


}
