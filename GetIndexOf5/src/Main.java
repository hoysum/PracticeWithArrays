public class Main {
    public static void main(String[] args) {

        // Declare an array to hold values
        int[] numbers = {2,5,9,0,2,1,8,5,4};

        // Loop through all elements in the array and print out the index each time the value is 5
        for(int index = 0; index < numbers.length; index++){
			
            // if the value at this index of the array equals 5, print out that index
            if(numbers[index] == 5) {
                System.out.println("The value at this index equals 5, this index is: " + index);
            }

            // Print out what is going on
//            System.out.println("if (numbers[" + index + "] == 5) {\n\tPrint out the value of index");
//            System.out.println("\tnumbers[" + index + "] = " + numbers[index] + "\n}\n");
        }
    }
}
