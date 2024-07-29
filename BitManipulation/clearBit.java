package BitManipulation;

public class clearBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; //0101
		int pos = 2;
		int bitMask = 1<<pos;
		int notBitMask = ~(bitMask);
		
		int newNumber = notBitMask & n;
		System.out.println(newNumber);

	}

}
