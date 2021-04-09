package exercises;

public class SmurfFactory {
	public static void main(String[] args) {
		Smurf a = Smurf.createSmurf("other");
		System.out.println(a.getName());
		if (a.getName() != "papa") {
			System.out.println("Cannot create smurf!!!");
		} else {
			a.printName();
			a.eat();
		}
		
//		Smurf.createSmurf("handy");
//		Smurf.createSmurf("tom");
//		Smurf.createSmurf("jerry");
//		Smurf.createSmurf("mike");
//		new Smurf("suzanne").printName();
		
	}
}
