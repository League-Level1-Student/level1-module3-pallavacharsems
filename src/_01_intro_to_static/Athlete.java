package _01_intro_to_static;

public class Athlete {
	static int nextBibNumber;
	static String raceLocation = "New York";
	static String raceStartTime = "9.00am";

	String name;
	int speed;
	int bibNumber;

	Athlete(String name, int speed) {
		this.name = name;
		this.speed = speed;
		this.bibNumber = nextBibNumber;
		nextBibNumber = nextBibNumber+1;
	}

	public static void main(String[] args) {
		// create two athletes
		// print their names, bibNumbers, and the location of their race.
	Athlete Jeff = new Athlete("Jeff", 50);
	Athlete Don = new Athlete("Don", 75);
	System.out.println(Jeff.name);
	System.out.println(Jeff.speed);
	System.out.println(Jeff.bibNumber);
	System.out.println(Jeff.raceLocation);
	System.out.println(Don.name);
	System.out.println(Don.speed);
	System.out.println(Don.bibNumber);
	System.out.println(Don.raceLocation);

	}
	
}
