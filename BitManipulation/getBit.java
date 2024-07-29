package BitManipulation;

public class getBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5; //0101
		 int pos = 2;
		 int bitMask = 1<<pos;
		 
		 if((bitMask & n) == 0) {
			 System.out.println("Bit was Zero");
			 }else {
				 System.out.println("Bit was not Zero");
			 }

	}

}
