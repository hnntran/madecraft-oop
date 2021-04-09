package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class List_type {
	public static void main(String[] args) {
		// Array list
		List<String> another_list = Arrays.asList("Tran", "Xuan", "Bin", "Bush");
//		ArrayList<String> array_list = new ArrayList<>();
////		array_list.add("Tran");
////		array_list.add("Xuan");
////		array_list.add("Bin");
////		array_list.add("Bush");
//		array_list.addAll(another_list);
//		
//		System.out.println("Array list: " + array_list);
//		System.out.print("Elements: ");
//		for (String n : array_list) {
//			System.out.print(n + " ");
//		}
//		System.out.println("\nFirst element: " + array_list.get(0));
//		System.out.println("Last element: " + array_list.get(array_list.size() - 1));
//		array_list.remove(0);
//		array_list.add(1, "Tran");
//		array_list.set(1, "Bibeo");
//		System.out.println("Add and set an element: " + array_list);
//		Collections.sort(array_list);
//		System.out.println("Sort: " + array_list);
//		Collections.sort(array_list, Collections.reverseOrder());
//		System.out.println("Reversed sort: " + array_list);
////		array_list.clear();
////		System.out.println("Remove all elements: " + array_list);

		// Linked list
		LinkedList<String> linked_list = new LinkedList<>(another_list);
//		linked_list.addAll(array_list);
		System.out.println("Linked list: " + linked_list);
		linked_list.addFirst("Oanh");
		linked_list.addLast("Oanh");
		System.out.println("Linked list: " + linked_list);
		System.out.println("First elment: " + linked_list.getFirst());
		System.out.println("Second elment: " + linked_list.get(1));
		
	}
}
