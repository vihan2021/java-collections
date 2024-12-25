package collections;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(30);
		al1.add(20);
		al1.add("vamsi");
		al1.add("gangadhar");
		//al1.remove(20);
		System.out.println(al1);
		ArrayList al2=new ArrayList();
		al2.add("vihan");
		al2.add(3);
		al2.add("anougna");
		ArrayList al3=new ArrayList();
		al3.add(al2);
		al3.add(0,6);
		al3.add(1,9);
		System.out.println(al3);
		
		
		

	}

}
