package collections;

import java.util.LinkedList;

public class Linklist1 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(30);
		l1.add("ineuron");
		System.out.println(l1);
		l1.addFirst("hello");
		l1.add(3,99);
		l1.addLast("bangolore");
		System.out.println(l1);

	}

}
