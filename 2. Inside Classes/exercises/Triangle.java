package exercises;

public class Triangle {
	
	private int a,b,c;
	private double area;
	private int perimeter;
	
	
	
	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void area() {
		double s = (a+b+c)/2.0;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
		System.out.println("Area of the triangle is: " + area);
	}
	
	void perimeter() {
		perimeter = a + b + c;
		System.out.println("Perimeter of the triangle is: " + perimeter);
	}
	
	public static void main(String[] args) {
		Triangle tri = new Triangle(3,4,5);
		tri.area();
		tri.perimeter();
	}
}
