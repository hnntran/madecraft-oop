/*--------------- Reverse a string ---------------*/

package exercises;

import java.util.*;

public class ReverseString {
	
	// Passing the entire array to make change the original array
	public static void swap_Char (char[] arr, int a, int b) {
		char c = arr[a];
		arr[a] = arr[b];
		arr[b] = c;
	}
	
	public static void main (String[] args) {
		
		String str = "Hello World";
		/*--------------- Method 1 ---------------*/
		// Convert string to bytes
//		byte[] reverse_str = str.getBytes();
//		System.out.print("Original string: ");
//		for (byte b : reverse_str) {
//			System.out.format("%c", b);
//		}
//		byte[] result = new byte[reverse_str.length];
//		for (int i = 0; i < reverse_str.length; i++) {
//			result[result.length - i - 1] = reverse_str[i];
//		}
//		System.out.print("\nReverse string: ");
//		for (byte b : result) {
//			System.out.format("%c", b);
//		}

		/*--------------- Method 2 ---------------*/
		// Using StringBuilder
//		StringBuilder str_builder = new StringBuilder();
//		str_builder.append(str);
//		System.out.println("Original string: " + str_builder.toString());
//		System.out.println("Reverse string: " + str_builder.reverse().toString());
//		System.out.println("String builder: " + str_builder.toString());

		/*--------------- Method 3 ---------------*/
		// Covert string to character array
//		char[] char_array = new char[str.length()];
//		char_array = str.toCharArray();
//		System.out.print("Original string: ");
//		for (char c : char_array) {
//			System.out.print(c);
//		}
//		// Method 1:
//		System.out.print("\nReverse string: ");
//		for (int i = char_array.length - 1; i >= 0; i--) {
//			System.out.print(char_array[i]);
//		}
//		// Method 2:
//		for (int i = 0; i < (char_array.length / 2); i++) {
//			swap_Char(char_array, i, char_array.length - i - 1);
//		}
//		System.out.print("\nReverse string: ");
//		for (char c : char_array) {
//			System.out.print(c);
//		}

		/*--------------- Method 4 ---------------*/
		// Convert to ArrayList object and use Collections reverse
//		char[] char_array = str.toCharArray();
//		List<Character> array_list = new ArrayList<>();
//		for (char c : char_array) {
//			array_list.add(c);
//		}

//		String[] str_array = str.split("", 0); // use split with delimiter
//		String[] str_array = str.split("(?!^)"); // use split with delimiter
//		List<String> array_list = new ArrayList<>();
//		array_list = Arrays.asList(str_array);
//		System.out.println("Original string: " + array_list);
//		Collections.reverse(array_list);
//		System.out.println("Reverse string: " + array_list);
//		System.out.print("Print out by for loop: ");
//		for(String s : array_list) {
//			System.out.print(s);
//		}
//		System.out.print("\nPrint out by iterator: ");
//		Iterator it = array_list.iterator();
//		while (it.hasNext()) {
//			System.out.print(it.next());
//		}

		/*--------------- Method 5 ---------------*/
		// Using StringBuilder
		StringBuffer str_buffer = new StringBuffer();
		str_buffer.append(str);
		System.out.println("Original string: " + str_buffer);
		str_buffer.reverse();
		System.out.println("Reverse string: " + str_buffer);
	}
}
