package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinklistIterator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lh=new LinkedList();
		lh.add("hello");
		lh.add(34);
		lh.add("dhdsfs");
	   lh.add(23);
		lh.add("vamsi");
		ListIterator litr1=lh.listIterator(lh.size());//reverse order
		while(litr1.hasPrevious()) { //reverse order  //fornt order{//litr1.next())}
			System.out.println(litr1.previous());//reverse order   {//litr1.hasnext(){front orderr}}
		}
		System.out.println("there is no Previous element in the list");//reverse//  {front}//there is no next element
		

	}

}
