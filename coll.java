import java.util.*;

public class collections {
    public static void main(String[] args) {
        // Using an Array
        // Arrays have a fixed size, meaning once created, the size cannot change.
        int[] numbers = new int[5];  // Array of integers with 5 elements
        numbers[0] = 10;  // Assigning value to the first element
        int[] predefinedNumbers = {1, 2, 3, 4, 5};  // Predefined array with values

        // Using an ArrayList
        List<String> list = new ArrayList<>();  // Creating a resizable list of Strings
        list.add("Apple");  // Adding elements to the list
        list.add("Banana");
        list.add("Cherry");
        System.out.println("List: " + list);  // Printing the list

        // ArrayList characteristics:
        // - Resizable: It can grow or shrink dynamically.
        // - Allows duplicate elements.
        // - Permits null values.
        // - Provides constant-time performance for accessing elements by index.
        // - Not synchronized: Not thread-safe without external synchronization.
        // - Use ArrayList when you need dynamic sizing and when order matters.

        // Using a HashSet
        Set<String> set = new HashSet<>();  // Creating a HashSet of Strings
        set.add("Apple");  // Adding elements to the set
        set.add("Banana");
        set.add("Apple");  // Duplicate element, will not be added again
        System.out.println("Set: " + set);  // Printing the set

        // HashSet characteristics:
        // - No duplicates allowed: Only unique elements are stored.
        // - Unordered: Does not maintain the insertion order.
        // - Allows null values.
        // - Provides fast access and retrieval (constant time, O(1)).
        // - Not synchronized: Not thread-safe without external synchronization.
        // - Use HashSet when you need fast access and unique elements.

        // Using a HashMap
        Map<String, Integer> map = new HashMap<>();  // Creating a HashMap with String keys and Integer values
        map.put("Apple", 3);  // Adding key-value pairs to the map
        map.put("Banana", 2);
        System.out.println("Map: " + map);  // Printing the map

        // HashMap characteristics:
        // - Stores key-value pairs.
        // - No duplicate keys allowed; each key must be unique.
        // - Unordered: Does not maintain any specific order of keys.
        // - Allows one null key and multiple null values.
        // - Provides fast access (constant time, O(1)) for key lookups.
        // - Not synchronized: Not thread-safe without external synchronization.
        // - Use HashMap for fast lookups using unique keys with no order requirements.

        // Using a Priority Queue
        Queue<String> queue = new PriorityQueue<>();  // Creating a PriorityQueue of Strings
        queue.add("Cherry");  // Adding elements to the queue
        queue.add("Apple");
        queue.add("Banana");
        System.out.println("Queue: " + queue.poll());  // Retrieves and removes the head of the queue
        System.out.println("Queue: " + queue.poll());

        // PriorityQueue characteristics:
        // - Elements are ordered based on their natural ordering or a comparator.
        // - Does not guarantee full sorting, but ensures that the least element (according to ordering) is always at the front.
        // - Does not allow null elements.
        // - Dynamic structure: It can grow or shrink as needed.
        // - Use PriorityQueue when elements need to be processed in a specific order (e.g., natural ordering).

        // Using a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();  // Creating a LinkedList of Strings
        linkedList.add("Apple");  // Adding elements to the list
        linkedList.add("Banana");
        String fruit = linkedList.get(0);  // Accessing the first element
        linkedList.remove("Apple");  // Removing the element "Apple"
        
        for (String item : linkedList) {  // Iterating through the list
            System.out.println(item);
        }

        // LinkedList characteristics:
        // - Doubly linked list: Each element points to both the previous and next elements.
        // - Allows duplicate elements.
        // - Allows null values.
        // - Efficient insertions and deletions at both ends.
        // - Can be used as both a list and a queue (FIFO: First In, First Out).
        // - Use LinkedList when you need frequent insertions/deletions in the list and order matters.

        // Using a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();  // Creating a TreeSet of Strings
        treeSet.add("Apple");  // Adding elements to the set
        treeSet.add("Banana");
        
        boolean containsApple = treeSet.contains("Apple");  // Checking if "Apple" exists in the set

        treeSet.remove("Apple");  // Removing "Apple" from the set
        
        for (String item : treeSet) {  // Iterating through the set
            System.out.println(item);
        }

        // TreeSet characteristics:
        // - Implements the Set interface and maintains elements in a sorted order.
        // - No duplicates allowed: Only unique elements are stored.
        // - Ordered: Maintains natural ordering (or ordering defined by a comparator).
        // - Does not allow null elements.
        // - Provides log(n) time complexity for basic operations like add, remove, and contains.
        // - Use TreeSet when you need unique elements in a sorted order.

        // Using a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();  // Creating a TreeMap with String keys and Integer values
        // Adding key-value pairs
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);

        int appleCount = treeMap.get("Apple");  // Accessing the value associated with the key "Apple"
        treeMap.remove("Apple");  // Removing the key "Apple" from the map

        // Iterates over the entries sorted by keys
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // TreeMap characteristics:
        // - Implements the Map interface and stores key-value pairs in a sorted order based on keys.
        // - No duplicate keys allowed; each key must be unique.
        // - Ordered: Maintains natural ordering of keys (or ordering defined by a comparator).
        // - Does not allow null keys, but allows null values.
        // - Provides log(n) time complexity for basic operations.
        // - Use TreeMap when you need key-value pairs in a sorted order by keys.

        // Using a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();  // Creating a LinkedHashMap with String keys and Integer values
        linkedHashMap.put("Apple", 1);  // Adding key-value pairs
        linkedHashMap.put("Banana", 2);

        appleCount = linkedHashMap.get("Apple");  // Accessing the value associated with the key "Apple"
        linkedHashMap.remove("Apple");  // Removing the key "Apple" from the map

        // Iterates over the entries in insertion order
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // LinkedHashMap characteristics:
        // - Extends HashMap and maintains a linked list of entries in insertion order.
        // - No duplicate keys allowed; each key must be unique.
        // - Ordered: Maintains insertion order.
        // - Allows one null key and multiple null values.
        // - Provides fast access like HashMap (constant time, O(1)).
        // - Use LinkedHashMap when you need key-value pairs in insertion order.

        // Using a Stack
        Stack<String> stack = new Stack<>();  // Creating a Stack of Strings
        stack.push("Apple");  // Pushing elements onto the stack
        stack.push("Banana");

        String top = stack.pop();  // Popping the top element (removes and returns it)
        String peek = stack.peek();  // Peeking at the top element (returns without removing)
        
        boolean isEmpty = stack.isEmpty();  // Checking if the stack is empty

        // Iterates over the elements in the stack
        for (String item : stack) {
            System.out.println(item);
        }

        // Stack characteristics:
        // - Represents a Last In, First Out (LIFO) stack of objects.
        // - Allows duplicate elements.
        // - Allows null elements.
        // - Push: Adds an element to the top of the stack.
        // - Pop: Removes and returns the top element.
        // - Peek: Returns the top element without removing it.
        // - Use Stack when you need a LIFO data structure.

        // Using a Vector
        Vector<String> vector = new Vector<>();  // Creating a synchronized Vector of Strings
        vector.add("Alpha");  // Adding elements to the Vector
        vector.add("Beta");
        vector.add("Gamma");

        // Iterates over the elements in the Vector
        for (String item : vector) {
            System.out.println(item);
        }

        // Vector characteristics:
        // - Represents a resizable array that is synchronized.
        // - Allows duplicate elements.
        // - Allows null elements.
        // - Thread-safe, but slower than ArrayList due to synchronization overhead.
        // - Use Vector when you need a thread-safe, dynamically resizable array.

        // Using a BitSet
        BitSet bitSet = new BitSet();  // Creating a BitSet
        bitSet.set(0);  // Setting the first bit to true
        bitSet.set(2);  // Setting the third bit to true

        // Iterates over the set bits
        for (int i = 0; i < bitSet.length(); i++) {
            if (bitSet.get(i)) {
                System.out.println("Bit " + i + " is set.");
            }
        }

        // BitSet characteristics:
        // - Represents a set of bits that grows as needed.
        // - Provides methods to set, clear, and check bits.
        // - Efficient for managing and performing operations on a large number of bits.
        // - Use BitSet when working with a large set of binary data.


        // Using an Enumeration
        Enumeration<String> enumeration = vector.elements();  // Creating an Enumeration for the Vector
        System.out.println("Enumeration elements:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        // Enumeration characteristics:
        // - Legacy interface for iterating through a collection.
        // - Replaced by Iterator, but still used with older classes like Vector and Hashtable.
        // - Does not support element removal.
        // - Use Enumeration when working with legacy code that requires it.


        // Using a Random
        Random random = new Random();  // Creating a Random number generator
        int randomNumber = random.nextInt(100);  // Generating a random number between 0 and 99
        System.out.println("Random number: " + randomNumber);

        // Random characteristics:
        // - Provides methods for generating random numbers of different types.
        // - Can be used for generating random booleans, integers, floats, etc.
        // - Use Random when you need to generate random numbers for various purposes.


        // Using a Scanner
        Scanner scanner = new Scanner(System.in);  // Creating a Scanner to read input from the console
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();  // Reading an integer input from the user
        System.out.println("You entered: " + input);

        // Scanner characteristics:
        // - Utility class for parsing primitive types and strings using regular expressions.
        // - Can be used to read input from various sources like console, file, or string.
        // - Use Scanner for simple and user-friendly input handling.


        // Using a Timer and TimerTask
        TimerTask task = new TimerTask() {  // Creating a TimerTask for scheduling a task
            @Override
            public void run() {
                System.out.println("TimerTask executed!");
            }
        };
        Timer timer = new Timer();  // Creating a Timer
        timer.schedule(task, 2000);  // Scheduling the task to run after 2 seconds

        // Timer and TimerTask characteristics:
        // - Timer schedules tasks for future execution in a background thread.
        // - TimerTask is an abstract class representing a task that can be scheduled.
        // - Use Timer and TimerTask for scheduling tasks that need to be executed later.


        // Using a UUID
        UUID uuid = UUID.randomUUID();  // Generating a random UUID
        System.out.println("Generated UUID: " + uuid);

        // UUID characteristics:
        // - Represents a Universally Unique Identifier (UUID) that is 128 bits long.
        // - Guarantees uniqueness across time and space.
        // - Use UUID when you need to generate unique identifiers for objects or entities.


        // Using Properties
        Properties properties = new Properties();  // Creating a Properties object
        properties.setProperty("username", "admin");  // Setting properties
        properties.setProperty("password", "12345");
        System.out.println("Properties: " + properties);

        // Properties characteristics:
        // - Represents a persistent set of key-value pairs, typically used for configuration.
        // - Supports both key-value pairs and default values.
        // - Use Properties for managing configuration settings or application properties.


    }
}
