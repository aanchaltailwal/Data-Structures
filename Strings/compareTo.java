package string;

public class compareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "Aanchal";
		String name2 = "Aanchal";
		
		//s1 > s2 -> +ve value
		//s1 = s2 -> 0
		//s1 < s2 -> -ve value
		
		if(name1.compareTo(name2)==0) {
			System.out.println("yes both are equal");
		}else {
			System.out.println("No");
		}

	}

}
