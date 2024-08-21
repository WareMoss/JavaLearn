// Main class to run the program
public class OOPDemo {
    public static void main(String[] args) {

        // Creating objects of Animal, Dog, and Cat
        Animal genericAnimal = new Animal("Generic Animal", 5);
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, "Siamese");

        // Demonstrating Encapsulation
        genericAnimal.setName("New Animal");
        System.out.println("Encapsulated Animal Name: " + genericAnimal.getName());

        // Demonstrating Inheritance and Method Overriding
        dog.makeSound();  // Dog class overrides makeSound() method
        cat.makeSound();  // Cat class overrides makeSound() method

        // Demonstrating Polymorphism
        Animal animalDog = dog;  // Dog is treated as an Animal
        Animal animalCat = cat;  // Cat is treated as an Animal
        animalDog.makeSound();   // Calls Dog's makeSound() method
        animalCat.makeSound();   // Calls Cat's makeSound() method

        // Demonstrating Abstraction with Animal and Vehicle
        Animal anotherDog = new Dog("Charlie", 4, "Beagle");
        anotherDog.makeSound();  // Calls Dog's makeSound() method
        
        Vehicle car = new Car("Toyota", 120);
        car.start();  // Calls Car's implementation of start()

        Vehicle bike = new Bike("Yamaha", 80);
        bike.start();  // Calls Bike's implementation of start()
    }
}

// Class demonstrating Encapsulation
class Animal {
    // Private fields (Encapsulation)
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getters and setters (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to make a sound (can be overridden)
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Class demonstrating Inheritance (Dog is a subclass of Animal)
class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);  // Calling the parent class (Animal) constructor
        this.breed = breed;
    }

    // Method overriding (Polymorphism)
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    // Additional method specific to Dog
    public String getBreed() {
        return breed;
    }
}

// Another subclass of Animal (Cat is a subclass of Animal)
class Cat extends Animal {
    private String color;

    // Constructor
    public Cat(String name, int age, String color) {
        super(name, age);  // Calling the parent class (Animal) constructor
        this.color = color;
    }

    // Method overriding (Polymorphism)
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }

    // Additional method specific to Cat
    public String getColor() {
        return color;
    }
}

// Abstract class demonstrating Abstraction
abstract class Vehicle {
    private String brand;
    private int speed;

    // Constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Abstract method (must be implemented by subclasses)
    public abstract void start();

    // Non-abstract method
    public void stop() {
        System.out.println(brand + " is stopping.");
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }
}

// Subclass of Vehicle demonstrating implementation of abstract method
class Car extends Vehicle {

    // Constructor
    public Car(String brand, int speed) {
        super(brand, speed);  // Calling the parent class (Vehicle) constructor
    }

    // Implementing the abstract method
    @Override
    public void start() {
        System.out.println(getBrand() + " car is starting at speed " + getSpeed() + " km/h.");
    }
}

// Another subclass of Vehicle
class Bike extends Vehicle {

    // Constructor
    public Bike(String brand, int speed) {
        super(brand, speed);  // Calling the parent class (Vehicle) constructor
    }

    // Implementing the abstract method
    @Override
    public void start() {
        System.out.println(getBrand() + " bike is starting at speed " + getSpeed() + " km/h.");
    }
}
