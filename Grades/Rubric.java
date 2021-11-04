public class Rubric {
	public void getGPA(double classGrade) {
		if (classGrade >= 97) {
				System.out.println("A+ -> 4.0");
			} else if (classGrade >= 93) {
				System.out.println("Your class grade is A -> 4.0");
			} else if (classGrade >= 90) {
				System.out.println("Your class grade is A- -> 3.7");
			} else if (classGrade >= 87) {
				System.out.println("Your class grade is B+ -> 3.3");
			} else if (classGrade >= 83) {
				System.out.println("B -> 3.0");
			} else if (classGrade >= 80) {
				System.out.println("Your class grade is B- -> 2.7");
			} else if (classGrade >= 77) {
				System.out.println("Your class grade is C+ -> 2.3");
			} else if (classGrade >= 73) {
				System.out.println("Your class grade is C -> 2.0");
			} else if (classGrade >= 70) {
				System.out.println("Your class grade is C- -> 1.7");
			} else if (classGrade >= 68) {
				System.out.println("Your class grade is D- -> 1.3");
			} else if (classGrade >= 65) {
				System.out.println("Your class grade is D -> 1.0");
			} else if (classGrade >= 63) {
				System.out.println("Your class grade is D- -> 0.7");
			} else if (classGrade < 63) {
				System.out.println("Your class grade is F -> 0.0");	
			}
	}	
}
