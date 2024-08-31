
package CollectionFramworks;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub<
		ArrayList<Integer> list = new ArrayList<Integer>();  //defining new array list
		
		//add elements
		list.add(0);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		//get elements
		int element = list.get(0);
		System.out.println(list);
		
		//add element in between
		list.add(1, 1);   //[idx, element]
		System.out.println(list);
		
		//set element
		list.set(0, 5);  //chng ele in 0th idx
		System.out.println(list);
		
		//delete element
		list.remove(3);  //3rd idx remove
		System.out.println(list);
		
		//size
		int size = list.size();
		System.out.println(size);
		
		//loops
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		
		//sorting
		Collections.sort(list);  //import Coolections
		System.out.println(list);

	}

}
