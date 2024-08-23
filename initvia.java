public class initvia { 
    public static void main(String[] args){
        Student s1 = new Student();  // initialising the object, student by reference variable s1
        Student s2=new Student(); 
        s1.insertRecord(111,"name1");// initialising via calling a method passing in values
        s2.insertRecord(222,"name2");  
        s1.displayInformation();  
        s2.displayInformation();
        System.out.println(s1.id + " " + s1.name);
    }
}

class Student { 
    int id;  
    String name; 
    int rollno;
    void insertRecord(int r, String n){  
        rollno=r;  
        name=n;  
       }
    void displayInformation(){System.out.println(rollno+" "+name);}
  
}
