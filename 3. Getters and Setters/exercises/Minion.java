package exercises;

public class Minion {
	
	private String name; 
	private int eyes; 
	private String color; 
	private String master;

	public Minion(String name, int eyes, String color, String master) {
		super();
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMaster(String string) {
		// TODO Auto-generated method stub
		this.name = string;
	}

	public Object getMaster() {
		// TODO Auto-generated method stub
		return name;
	}
	
	

}
