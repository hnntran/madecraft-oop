package examples;

public class Pond {
	public static void main(String[] args) {
		String me = "june";
		
		Duck duckA = new Duck("Donald", 90/3, "tacos");
		Duck duckB = new Duck("Wolfgang", 60/3, "salami");
		
		duckA.waddle();
		duckA.waddle();
		
		duckB.waddle();
		
		System.out.println(duckA);
	}
}
