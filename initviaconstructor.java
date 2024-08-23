class Employee {
        int id;
        String name;
        float salary;
    
        // Constructor to initialize employee details
        Employee(int i, String n, float s) {
            id = i;
            name = n;
            salary = s;
        }
    
        // Method to display employee details
        void display() {
            System.out.println(id + " " + name + " " + salary);
        }
    }
    
    public class initviaconstructor {
        public static void main(String[] args) {
            // Create and initialize Employee objects using the constructor
            Employee e1 = new Employee(101, "ajeet", 45000);
            Employee e2 = new Employee(102, "irfan", 25000);
            Employee e3 = new Employee(103, "nakul", 55000);
    
            // Display information of all employees
            e1.display();
            e2.display();
            e3.display();
        }
    }
