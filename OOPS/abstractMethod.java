package Oops;

abstract class Animal{   //only concept
	abstract void walk();
		
}
class Horse extends Animal{
	public void walk() {
		System.out.println("Walks on 4 legs");
	}
}
class Chicken extends Animal{
	public void walk() {
		System.out.println("Walks on 2 legs");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse horse = new Horse();
		horse.walk();

	}

}
