package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al1=new ArrayList();
		al1.add("hello");
		al1.add(34);
		al1.add(76);
		al1.add(23);
		al1.add(10.9);
		Iterator itr1=al1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("there is no next element in the list");
		
		

	}

}
