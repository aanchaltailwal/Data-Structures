package string;

public class reverseString {

	public static void main(String[] args) {
		String n = "abcd";
		String reversedStr = "";
		for(int i = n.length()-1; i>= 0; i--) {
			reversedStr = reversedStr + n.charAt(i);
		}
		System.out.println("Original string: " + n);    
        //Displays the reverse of given string    
        System.out.println("Reverse of given string: " + reversedStr);  

	}

}


}
