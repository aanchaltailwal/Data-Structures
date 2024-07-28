package stringBuilder;

public class operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Aanchal");
		System.out.println(sb);
		
		//char at Index
		System.out.println(sb.charAt(0));

		//set CharAt index
		sb.setCharAt(0, 'P');
		System.out.println(sb);
	}

}
