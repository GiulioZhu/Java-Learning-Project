import java.util.*;

public class ClassGrade {
	public static void main(String[] args) {
		List<String> categories = new ArrayList<String>();
		List<Double> grades = new ArrayList<Double>();
		List<Double> percentages = new ArrayList<Double>();
		List<Double> rubrics = new ArrayList<Double>();
		List<Double> listOfGrades = new ArrayList<Double>();
		double classGrade = 0;
		double sumOfGrades = 0;
		double grade;
		int numOfGrades;
		double enteredGrade;
		Scanner sc = new Scanner(System.in);
		Rubric rubric = new Rubric();

		System.out.println("Enter Number Categories");
		int numOfCategories = sc.nextInt();
		int loopVar = numOfCategories;
		//the "i" is the loop variable
		for (int index = 0; index < loopVar; index++) {
			System.out.println("Enter Name of the Category, '_' for space");
			String category = sc.next();
			categories.add(category);
			//For calculating grade for class
			System.out.println("Enter the number of grades for this class:");
			numOfGrades = sc.nextInt();
			for (int i = 0; i < numOfGrades; i++) {
				System.out.println("Enter grades for class, '999' for didn't receive grade");
				enteredGrade = sc.nextDouble();
				if (enteredGrade == 999) {
					categories.remove(index);
					i--;
					numOfCategories--;
					break;	
				} else if (enteredGrade != 999) {
					listOfGrades.add(enteredGrade);
					if (i == numOfGrades - 1) {
						for (int a = 0; a < numOfGrades; a++) {
							sumOfGrades += listOfGrades.get(a);
						}
						grade = sumOfGrades/numOfGrades;
						grades.add(grade);
						listOfGrades.clear();
						sumOfGrades = 0;
					}
				} else if (enteredGrade > 120) {
					System.out.println("Number is too big, retry");
					i--;
				}	
			}
			System.out.println("Enter the percentage (weighing) of Category (eg. 10%, 15%)");
			double percentage = sc.nextDouble();
			percentage /= 100;
			percentages.add(percentage);		
		}																																																							
		
		//Total Percentage before control structure
		double totPercentage = 0.0;
		for (int index = 0; index < numOfCategories; index++) {
			totPercentage += percentages.get(index);
		}
		//prompt for input
		System.out.println("Want to know Class Average Grade? (1 for yes, 0 for no)");
		int responce = sc.nextInt();
		if (responce == 1) {
			System.out.println("Grades:");
			if (totPercentage < 1) {
				double remainingPercentage = 1 - totPercentage;
				double toBeAddedPercentage = remainingPercentage / numOfCategories;
				for (int b = 0; b < numOfCategories; b++) {
					double newPercentage = percentages.get(b) + toBeAddedPercentage;
					percentages.set(b, newPercentage);
					classGrade += grades.get(b) * percentages.get(b);
					System.out.println(categories.get(b) + ": " + grades.get(b));
				}	
				System.out.println(classGrade);
				rubric.getGPA(classGrade);
			} else if (totPercentage == 1) {
				for (int c = 0; c < numOfCategories; c++) {
					classGrade += grades.get(c) * percentages.get(c);
					System.out.println(categories.get(c) + ": " + grades.get(c));
				} //this is for calculating the grade for class
				System.out.println(classGrade);
				rubric.getGPA(classGrade);
				
			}
		} else if (responce == 0) {
			System.out.println("Hope you succeed in your class!");
		}
	}
}	