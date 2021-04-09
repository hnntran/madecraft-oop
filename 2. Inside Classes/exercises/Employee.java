package exercises;

public class Employee {
	String name;
	int year;
	String address;
	
	public Employee(String name, int year, String address) {
		super();
		this.name = name;
		this.year = year;
		this.address = address;
	}

	@Override
	public String toString() {
		return name + "\t" + year + "\t\t" + address;
	}
	
	public static void main(String[] args) {
		Employee a = new Employee("Robert", 1994, "64C- WallsStreat");
		Employee b = new Employee("Sam", 2000, "68D- WallsStreat");
		Employee c = new Employee("John", 1999, "26B- WallsStreat");
				
		System.out.println("Name\tYear of Joining\tAddress");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
