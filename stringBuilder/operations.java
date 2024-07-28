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

		//Insert at Index
		sb.insert(0, 'S');
		System.out.println(sb);

		//delete the extra char
		sb.delete(3,4);
		System.out.println(sb);

		//append
		sb.append(" " + "Tailwal");
		System.out.println(sb);

		//length
		System.out.println(sb.length());
	}

}
