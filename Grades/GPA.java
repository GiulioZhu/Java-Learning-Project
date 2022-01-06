import java.util.*;
public class GPA {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you number of classes with grades");
		int numOfClasses = sc.nextInt();
		int range = 100;
		double sumOfGrades = 0.0;

		//ArrayList
		List<Double> conversion = new ArrayList<Double>();

		//Conditions
		for (int i = 0; i < numOfClasses; i++) {
			System.out.println("Enter your Grade");
			int grades = sc.nextInt();
			if (grades/range <= 1) {
				if (grades >= 97) {
					System.out.println("A+");
					conversion.add (4.0);
				} else if (grades >= 93) {
					System.out.println("A");
					conversion.add (4.0);
				} else if (grades >= 90) {
					System.out.println("A-");
					conversion.add (3.7);
				} else if (grades >= 87) {
					System.out.println("B+");
					conversion.add (3.3);
				} else if (grades >= 83) {
					System.out.println("B");
					conversion.add (3.0);
				} else if (grades >= 80) {
					System.out.println("B-");
					conversion.add (2.7);
				} else if (grades >= 77) {
					System.out.println("C+");
					conversion.add (2.3);
				} else if (grades >= 73) {
					System.out.println("C");
					conversion.add (2.0);
				} else if (grades >= 70) {
					System.out.println("C-");
					conversion.add (1.7);
				} else if (grades >= 68) {
					System.out.println("D-");
					conversion.add (1.3);
				} else if (grades >= 65) {
					System.out.println("D");
					conversion.add (1.0);
				} else if (grades >= 63) {
					System.out.println("D-");
					conversion.add (0.7);
				} else if ( grades < 63) {
					System.out.println("F");
					conversion.add (0.0);
				}
			} else if (grades/range > 1) {
				System.out.println("Not in range");
				i--;
			}
		}
		System.out.println("Want to know GPA? (1 for Yes or 2 for No)");
		int answer = sc.nextInt();
		if (answer == 1) {
			for (int i = 0; i < numOfClasses; i++) {
				sumOfGrades += conversion.get(i);				
			}
			double GPA = sumOfGrades/numOfClasses;
			System.out.println("");
			System.out.println("GPA = " + GPA);		
		} else if (answer == 2) {
			System.out.println("Want to know a list of your Letter Grades? (1 for Yes or 2 for No)");
				if (answer == 1) {
					for (int i = 0; i < numOfClasses; i++) {
						System.out.println(conversion.get(i));
					}
				} else if (answer == 2) {
					System.out.println("Hope you get 4.0 GPA");
				}

		}	
	}
}
