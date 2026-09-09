import java.util.Scanner;



public class Main {

	//this is the main method
	public static void main(String[] args) {
		
		// create a scanner object that will be used throughout main method for getting input 
		Scanner scanner = new Scanner(System.in);
		
		// this will later determine what will happen during this program usage
		System.out.println("Would you like to (1) make a split, (2) view a split, (3) log a workout, ");
		int iniResponse = scanner.nextInt();
		scanner.nextLine();
		
		User user1 = new User();
				
		if(iniResponse == 1) {	
			Split newSplit = createSplit();	
			user1.add_split(newSplit);
			displaySplit(newSplit);				
		}
		else if (iniResponse == 2) {
			System.out.print("Which split do you want to display? ");
			for(int i = 0, n = user1.get_split_count(); i < n; i++) {
				System.out.print(" (" + (i + 1) + ") " + user1.get_split(i).get_name());
			}
			System.out.println();
			int splitIdentifier = scanner.nextInt() - 1;
			scanner.nextLine();
			
			displaySplit(user1.get_split(splitIdentifier));
		}
		else if (iniResponse == 3) {
			for (int i = 0, n = user1.get_split_count(); i < n; i++) {
		        System.out.print(" (" + (i + 1) + ") " + user1.get_split(i).get_name());
		    }

		    System.out.println();

		    int splitIdentifier = scanner.nextInt() - 1;
		    scanner.nextLine();

		    Split selectedSplit = user1.get_split(splitIdentifier);

		    CompletedDay completedDay = logWorkout(selectedSplit);

		    user1.add_completed_day(completedDay);

		    displayLog(completedDay);
			
			}
	}
		
	//displays the split
	static void displaySplit(Split split1) {
		System.out.println(split1.get_name() + "!");
		for(int i = 0, n = split1.get_split_length(); i < n; i++) {
			System.out.println(split1.get_workout_day(i).get_name() + ":");
			for(int j = 0, m = split1.get_workout_day(i).get_workout_length(); j < m; j++) {
				System.out.println(split1.get_workout_day(i).get_exercise(j).get_sets_quantity() + " sets of " + split1.get_workout_day(i).get_exercise(j).get_name());
			}
		}
	}
	static Split createSplit() {
		System.out.println("Name your split below:");

		Scanner scanner = new Scanner(System.in);

		String splitName = scanner.nextLine();
		Split split1 = new Split(splitName);
		
		// get the count of days and then populate that specific split object with its workout days
		System.out.println("How many different days are in your split cycle.");
		int splitLength = scanner.nextInt();
		scanner.nextLine();
		split1.populate_split(splitLength);
		
		// this loops for the amount of days there are and populates each of its workout days
		for (int i = 0; i < splitLength; i++) {
			System.out.println("How many different exercises are on " + split1.get_workout_day(i).get_name() + " day:");
			int workoutLength = scanner.nextInt();
			scanner.nextLine();
			
			split1.get_workout_day(i).populate_workout_day(workoutLength);	
		}
		return split1;	
	}
	
	static CompletedDay logWorkout(Split split1) {
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("What's the date?");
		String date = scanner.nextLine();
		
		System.out.print("Which workout did you do? ");
		for(int i = 0, n = split1.get_split_length(); i < n; i++) {
			System.out.print(" (" + (i + 1) + ") " + split1.get_workout_day(i).get_name());
		}
		System.out.println();
		int dayIdentifier = scanner.nextInt() - 1;
		scanner.nextLine();

		
		CompletedDay completedDay1 = new CompletedDay(date, split1.get_workout_day(dayIdentifier));
		
		completedDay1.autofill_completed_exercises();
		
		for(int i = 0, n = split1.get_workout_day(dayIdentifier).get_workout_length(); i < n; i++) {
			completedDay1.add_completed_exercise(i);
		}
		return completedDay1;
	}
	
	static void displayLog(CompletedDay completedDay1) {
		System.out.println(completedDay1.get_date() + " - " + completedDay1.get_workout_day().get_name());
		
		for(int i = 0, n = completedDay1.get_workout_day().get_workout_length(); i < n; i++) {
			System.out.println("\n Exercise " + (i + 1) + ": " + completedDay1.get_workout_day().get_exercise(i).get_name());
			for(int j = 0, m = completedDay1.get_completed_exercise(i).get_completed_set_count(); j < m; j++) {
				System.out.println("Set " + (j + 1) + ": " + completedDay1.get_completed_exercise(i).get_completed_set(j).get_weight() + "lbs for " + 
						completedDay1.get_completed_exercise(i).get_completed_set(j).get_rep_count() + " reps");
			}
		}
	}
}


