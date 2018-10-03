import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Declare new instance of the Scanner object to read in input from the user
        Scanner in = new Scanner(System.in);

        // Declare an array to hold 10 numbers
        int[] numbers = new int[10];
        int sum = 0;
        int average = 0;

        // for loop for to get, store and sum 10 input fromt he user
        for(int index = 0; index < numbers.length; index++) {

            // Ask the user for a number
            System.out.print("Enter a number: ");

            // Store that number into the first element of the array
            numbers[index] = in.nextInt();

            // Print out what is happening
            System.out.println("numbers[" + index +"] = " + numbers[index]);
            System.out.println("sum = " + sum + " + " + "numbers[" + index + "]");

            // Add that number to a running total, the sum
            sum = sum + numbers[index];


            System.out.println();
        }

        // average = sum/total numbers of elements in the array
        average = sum/numbers.length;
        // Print out average of the inputted numbers
        System.out.println("Average of user inputted numbers: " + average
        );
    }
}
