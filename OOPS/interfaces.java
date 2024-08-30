package Oops;

interface Animal{
	int eyes = 2;
	void walk(); 
}
interface Herbivore{
	
}
class Horse implements Animal, Herbivore{        //multiple inheritance
	public void walk() {
		System.out.println("walks on 4 legs");
	}
}
public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse horse = new Horse();
		horse.walk();

	}

}
