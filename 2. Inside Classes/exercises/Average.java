package exercises;

import java.util.Scanner;

public class Average {
	
	private int a,b,c;
	private double average;
	private int[] array = new int[3];
	
	public Average(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		array[0] = a;
		array[1] = b;
		array[2] = c;
	}
	
	double average() {
		int sum = 0;
		for (int value : array) {
			sum += value;
		}
		average = sum/array.length;
		return average;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		Average ave = new Average(a,b,c);
		
		System.out.println("Average = " + ave.average());
	}

}
