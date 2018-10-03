public class Main {
    public static void main(String[] args){
        // Declare an initialize the array to hold the numbers 1-10
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Declare a variable called sum and give it a start value of 0
        int sum = 0;

        // Loop through the array and sum up all its values
        for(int index = 0; index < numbers.length; index++) {
            System.out.println("sum = " + sum + " + " + "numbers[" + index + "]");
            System.out.println("numbers[" + index + "] = " + numbers[index]); // This prints out what is happening when we do the calculation below

            sum = sum + numbers[index]; // Each time we get a new value from the array, we add it to sum
        }

        System.out.println("Sum of numbers 1-10: " + sum);
    }
}
