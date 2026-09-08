import java.util.Scanner;


public class main {

	//this is the main method
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to (1) make a split, (2) view a split, (3) log a workout");
		int iniResponse = scanner.nextInt();
		scanner.nextLine();
		
		Split split1 = null;
		
		
		if(iniResponse == 1) {
			
			// get the name and make a split object with this name
			System.out.println("Name your split below:");
			String splitName = scanner.nextLine();
			split1 = new Split(splitName);
			
			System.out.println("How many different days are in your split cycle.");
			int splitLength = scanner.nextInt();
			scanner.nextLine();
			split1.populate_split(splitLength);
			
			for (int i = 0; i < splitLength; i++) {
				System.out.println("How many different exercises are on " + split1.get_workout_day(i).get_name() + " day:");
				int workoutLength = scanner.nextInt();
				scanner.nextLine();
				
				split1.get_workout_day(i).populate_workout_day(workoutLength);			
			}
			
			displaySplit(split1);				
		}
		else if(iniResponse == 2) {
			displaySplit(split1);
		}
	}
		
	static void displaySplit(Split split1) {
		System.out.println(split1.get_name() + "!");
		for(int i = 0, n = split1.get_split_length(); i < n; i++) {
			System.out.println(split1.get_workout_day(i).get_name() + ":");
			for(int j = 0, m = split1.get_workout_day(i).get_workout_length(); j < m; j++) {
				System.out.println(split1.get_workout_day(i).get_exercise(j).get_sets_quantity() + " sets of " + split1.get_workout_day(i).get_exercise(j).get_name());
			}
		}
	}

	 
}


