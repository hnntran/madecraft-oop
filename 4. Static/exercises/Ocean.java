package exercises;

public class Ocean {
	public static void main(String[] args) {
		SeaCreature sponge = new SeaCreature("Spongebob");
		sponge.eat();
		sponge.laugh();
		
		SeaCreature patrick = new SeaCreature("Patrick");
		System.out.println(patrick.getName());
		patrick.eat();
		patrick.laugh();
		
		SeaCreature squid = new SeaCreature("Squidward");
		System.out.println(squid.getName());
		squid.eat();
		squid.laugh();
	}
}
