package exercises;

public class Smurf {

	private String name;
	private static String name1 = "papa";

	public static Smurf createSmurf(String name) {
		System.out.println("Creating " + name + " Smurf");
		return new Smurf(name);
	}

	private Smurf(String name) {
		if (name == "papa") {
			this.name = name;
		}
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}
	
	String getName() {
		return this.name;
	}

}
