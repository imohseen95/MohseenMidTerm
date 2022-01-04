package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		System.out.println("List before removing ");
		System.out.println(list);

		System.out.println("List after removing ");
		list.remove(0);
		System.out.println(list);

		System.out.println("using for each loop");
		for (Integer l1 : list) {
			System.out.println(l1);
		}
		System.out.println("using iterator");
		Iterator it = list.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}

	}


