public class loopsntax {
    public static void main(String[] args) {
        // Calling methods to demonstrate different loop types
        dowhile.doloop();  // Calls the do-while loop method
        forloop.forloopsyn();  // Calls the for loop method
        whileloop.whileloopsyn();  // Calls the while loop method
    }

    // Class demonstrating the use of a do-while loop
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
    static class forloop { // Starts index at 0, so it prints 0 to 4
        public static void forloopsyn() {
            // for loop with an initialization, condition, and increment statement
            for (int i = 0; i < 5; i++) {
                System.out.println(i);  // Prints the current value of i
            }
        }
    }

    // Class demonstrating the use of a while loop
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
}
