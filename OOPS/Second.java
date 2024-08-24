package Oops;

class Pen {
    String color;
    String type;

    // Method to simulate writing with the pen
    public void write() {
        System.out.println("writing");
    }

    // Method to print the color of the pen
    public void printColor() {
        System.out.println(this.color);
    }
}

public class Second {
    public static void main(String[] args) {
        // Create the first Pen object and assign values
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        // Create the second Pen object and assign values
        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        // Call the printColor method to print the color of each pen
        pen1.printColor();
        pen2.printColor();
    }
}
