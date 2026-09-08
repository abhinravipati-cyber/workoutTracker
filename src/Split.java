import java.util.ArrayList;
import java.util.Scanner;

public class Split {

	Scanner scanner = new Scanner(System.in);
	
	private String _name;
	
	private ArrayList<WorkoutDay> dayList = new ArrayList<>();
	
	// populates the split's ArrayList of days with all the different workout days
	void add_day(WorkoutDay...day) {
		for(int i = 0, n = day.length; i < n; i++) {
			dayList.add(day[i]);
		}
	}
	
	void populate_split(int splitLength) {
		for(int i = 0; i < splitLength; i++) {
			System.out.println("Make a name for day " + (i + 1) + ":");
			String name = scanner.nextLine();
			WorkoutDay day = new WorkoutDay(name);
			
			dayList.add(day);
		}
	}
	
	WorkoutDay get_workout_day(int i) {
		return dayList.get(i);
	}
	
	int get_split_length() {
		return dayList.size();
	}
	
	public Split(String name) {
		set_name(name);
	}
	
	void set_name(String name) {
		_name = name;
	}
	
	String get_name() {
		return _name;
	}
}
