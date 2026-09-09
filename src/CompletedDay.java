import java.util.ArrayList;


public class CompletedDay {

	String _date;
	WorkoutDay _workoutDay;
	
	ArrayList<CompletedExercise> completedExerciseList = new ArrayList<>();
	
	public CompletedDay(String date, WorkoutDay workoutDay) {
		set_date(date);
		_workoutDay = workoutDay;
	}
	
	void autofill_completed_exercises() {
		
		for(int i = 0, n = _workoutDay.get_workout_length(); i < n; i++) {
			CompletedExercise completedExercise = new CompletedExercise(_workoutDay.get_exercise(i));
			
			completedExerciseList.add(completedExercise);
		}
		
	}
	
	void set_date(String date) {
		_date = date;
	}
	
	void add_completed_exercise(int i) {
		completedExerciseList.get(i).populate_completed_set_list();
	}
	
	CompletedExercise get_completed_exercise(int i ) {
		return completedExerciseList.get(i);
	}
	
	String get_date() {
		return _date;
	}
	
	WorkoutDay get_workout_day() {
		return _workoutDay;
	}
}
