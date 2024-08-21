public class loopsntax {
    public static void main(String[] args) {
        // Calling methods to demonstrate different loop types
        dowhile.doloop();  // Calls the do-while loop method
        forloop.forloopsyn();  // Calls the for loop method
        whileloop.whileloopsyn();  // Calls the while loop method
        forarray.forarraysyn(); // Calls the for array loop method
    }

    // Class demonstrating the use of a do-while loop
    // follows syntax do - code to be executed - while ( condition)
    static class dowhile {
        public static void doloop() {
            int i = 0;
            // do-while loop runs at least once before checking the condition
            do {
                System.out.println(i);  // Prints the current value of i
                i++;  // Increments i by 1
            } while (i < 5);  // Continues looping while i is less than 5
        }
    }

    // Class demonstrating the use of a for loop
    // follows syntax for (initialization; condition; update)
    static class forloop { // Starts index at 0, so it prints 0 to 4
        public static void forloopsyn() {
            // for loop with an initialization, condition, and increment statement
            for (int i = 0; i < 5; i++) {
                System.out.println(i);  // Prints the current value of i
            }
        }
    }

    // Class demonstrating the use of a while loop
    //  follows syntax while (condition) - code to be executed
    static class whileloop {
        public static void whileloopsyn() {
            int i = 0;
            // while loop checks the condition before entering the loop
            while (i < 5) {
                System.out.println(i);  // Prints the current value of i
                i++;  // Increments i by 1
            }
        }
    }
    // Class demonstrating the use of a for loop including an array
    // follows syntax for (type element : array/collection)
    static class forarray{
    public static void forarraysyn() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number); // iterates over elements in array and prints them to the screen
        }
    }
}
}
