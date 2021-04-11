package org.add.list;

import java.util.LinkedList;
import java.util.List;

public class AddList {
	public static void main(String[] args) {
		List<Integer> l= new LinkedList<>();
		//8.1 Add the value in 2nd index of the List
		 l.add(10);
		 l.add(20);
		 l.add(30);
		 l.add(90);
		 l.add(10);
		 l.add(10);
		 l.add(40);
		 l.add(50);
		 System.out.println(l);
		 System.out.println(" 8.1 Add the values 2nd index of  list "); 
		 l.add(2,50);
		 System.out.println(l);
		 
		//8.2 Add the value in end of the index
		 System.out.println(" 8.2  Add the value in last of the index "); 
		 l.add(70);
		 System.out.println(l);
		 
		//8.4 Add the value in last index of 10 in the List
		 List<Integer> li= new LinkedList<>();	 
		 li.add(10);
		 li.add(20);
		 li.add(30);
		 li.add(90);
		 li.add(10);
		 li.add(10);
		 li.add(40);
		 li.add(50);
		 
		 System.out.println(" 8.4 Add the value in last index of 1o  the list ");
		 li.set(5, 100);
		 System.out.println(li);
		 
	}
}
