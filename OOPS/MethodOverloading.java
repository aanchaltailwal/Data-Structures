package Oops;

class Stu {
    String name;
    int age;
    
    // Method to print name
    public void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Method to print age
    public void printInfo(int age) {
        System.out.println("Age: " + age);
    }
    
    // Method to print both name and age
    public void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Overloading {
    public static void main(String[] args) {
        Stu s1 = new Stu();
        s1.name = "Aanchal";
        s1.age = 21;

        // Call the appropriate overloaded method
        s1.printInfo(s1.name);   // Print name
        s1.printInfo(s1.age);    // Print age
        s1.printInfo(s1.name, s1.age); // Print both name and age
    }
}
