package exercises;

import java.util.Scanner;

public class Rectangle {
	
	private int length, breadth;
	private int area, perimeter;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getArea() {
		area = length * breadth;
		return area;
	}
	
	public int getPerimter() {
		perimeter = (length + breadth) * 2;
		return perimeter;
	}
	
	
	
	@Override
	public String toString() {
		return "Rectangle [area=" + area + ", perimeter=" + perimeter + "]";
	}

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(4, 5);
		rec1.getArea();
		rec1.getPerimter();
		
		Rectangle rec2 = new Rectangle(5, 8);
		rec2.getArea();
		rec2.getPerimter();
		
        Scanner sc = new Scanner(System.in); 
		System.out.println("Enter length and breadth: ");
		int l = sc.nextInt();
		int d = sc.nextInt();
		Rectangle rec3 = new Rectangle(l, d);
		rec3.getArea();
		rec3.getPerimter();
        
		System.out.println(rec1);
		System.out.println(rec2);
		System.out.println(rec3);
	}
}
