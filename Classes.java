package Oops;
class Pen{
	String color;
	String type;
	
	public void write() {
		System.out.println("writing");
	}
}

public class OOPS {
	//main function

	public static void main(String[] args) {
		Pen pen1 = new Pen();
		pen1.color = "blue";   //assign values
		pen1.type = "gel";
		
		pen1.write(); //call write method/func
		

	}

}
