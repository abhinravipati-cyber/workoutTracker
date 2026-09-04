import java.util.ArrayList;

public class WorkoutDay {

	private String _name;
	
	ArrayList<Exercise> exerciseList = new ArrayList<>();
	
	int get_workout_length() {
		return exerciseList.size();
	}
	
	
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
