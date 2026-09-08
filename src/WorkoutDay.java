import java.util.ArrayList;
import java.util.Scanner;


public class WorkoutDay {

	// creates a name variable that THIS class only will hold and know
	private String _name;
	
	// creates an array list of objects, specifically exercises, that each workout day will get in it
	private ArrayList<Exercise> exerciseList = new ArrayList<>();
	
	Scanner scanner = new Scanner(System.in);
	
	void populate_workout_day(int dayLength) {
		for(int i = 0; i < dayLength; i++) {
			System.out.println("Please enter a name and how many sets of your exercise " + (1 + i) + " in this format (NAME, # OF SETS):");
			String[] parts = scanner.nextLine().split(", ");
			String name = parts[0].trim();
			String setsString = parts[1].trim();
			int sets = Integer.parseInt(setsString);
			
			Exercise exercise = new Exercise(name, sets);	
			
			exerciseList.add(exercise);
		}
	}
	
	// this returns the length of the exercise list, to be used for things like for loops and stuff 
	int get_workout_length() {
		return exerciseList.size();
	}
	
	// for encapsulation, this returns a specific exercise in the Exercise ArrayList
	Exercise get_exercise(int i) {
		return exerciseList.get(i);	
	}
	
	// this is a function to populate the exerciseList for each object of workout day all at once.
	void add_exercise(Exercise...exercise ) {
		
		for(int i = 0, n = exercise.length; i < n; i++) {
			exerciseList.add(exercise[i]);
		}
	}
	
	
	
	public WorkoutDay(String name) {
		set_name(name);
	}

	void set_name(String name) {
		_name = name;
	}
	
	String get_name() {
		return _name;
	}
	
}
