package Oops;

class info{
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
}

public class student {
	public static void main(String[] args) {
		info s1 = new info();
		s1.name = "Aanchal";
		s1.age = 21;
		
		s1.printInfo();
		

	}

}
