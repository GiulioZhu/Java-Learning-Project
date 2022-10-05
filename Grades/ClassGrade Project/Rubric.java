public class Rubric {

    public Rubric() {
    }
    public void getGPA(double grade) {
        if (grade >= 97) {
            System.out.println("A+");
        } else if (grade >= 93) {
            System.out.println("A");
        } else if (grade >= 90) {
            System.out.println("A-");
        } else if (grade >= 87) {
            System.out.println("B+");
        } else if (grade >= 83) {
            System.out.println("B");
        } else if (grade >= 80) {
            System.out.println("B-");
        } else if (grade >= 77) {
            System.out.println("C+");
        } else if (grade >= 73) {
            System.out.println("C");
        } else if (grade >= 70) {
            System.out.println("C-");
        } else if (grade >= 68) {
            System.out.println("D-");
        } else if (grade >= 65) {
            System.out.println("D");
        } else if (grade >= 63) {
            System.out.println("D-");
        } else if ( grade < 63) {
            System.out.println("F");
        }
    }
}
