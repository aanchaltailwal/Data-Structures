package stringBuilder;

public class reverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String original = "hello";
        
        // Create a StringBuilder object initialized with the original string
        StringBuilder reversed = new StringBuilder(original);
        
        // Use the reverse() method of StringBuilder to reverse the string
        reversed.reverse();
        
        // Convert StringBuilder back to String
        String reversedString = reversed.toString();
        
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversedString);
    }
}
