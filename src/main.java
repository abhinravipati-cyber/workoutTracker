

public class main {

	//this is the main method
	public static void main(String[] args) {
		
		/*don't understand what this means yet 
		Scanner scanner = new Scanner(System.in);
		
		//this is getting user input and storing it in the name variable for the first day 
		System.out.println("Enter name of first Workout day: ");
		String day1_name = scanner.nextLine();*/
		
		WorkoutDay day1 = new WorkoutDay("Arms");
		
		Exercise exercise1 = new Exercise("Bicep Curls", 3);
		Exercise exercise2 = new Exercise("Tricep Pushdowns", 3);
		Exercise exercise3 = new Exercise("Shoulder Press", 3);
		
		day1.add_exercise(exercise1, exercise2, exercise3);
		
		
		
		// use a for loop to print the entire workout plan for Day 1
		for(int i = 0, n = day1.get_workout_length(); i < n; i++) {
		System.out.println(day1.exerciseList.get(i).get_sets_quantity() + " sets of " + day1.exerciseList.get(i).get_name());
		}
	}
}
