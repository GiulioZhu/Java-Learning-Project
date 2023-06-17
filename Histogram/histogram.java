import java.util.*;

public class histogram {
    public static String generateStars(int count) {
        String stars = "";
        for (int i = 0; i < count; i++) {
            stars += "*";
        }
        return stars;
    }
    public static void main(String[] args) {
        // Initialize counter for different age groups
        int ageGroup1 = 0; // 0-19
        int ageGroup2 = 0; // 20-39
        int ageGroup3 = 0; // 40-69
        int ageGroup4 = 0; // 70-89
        int ageGroup5 = 0; // 90-109

        Scanner sc = new Scanner(System.in);
        int age = 0;
        int max = 0;
        int min = 109;
        while(age >= 0 && age <= 109) {
            System.out.println(("Enter age: "));
            age = sc.nextInt();
            if (age > max) {
                max = age;
            }
            if (age < min) {
                min = age;
            }

            if (age > 90) {
                ageGroup5++;
            } else if (age > 70) {
                ageGroup4++;
            } else if (age > 40) {
                ageGroup3++;
            } else if (age > 20) {
                ageGroup2++;
            } else {
                ageGroup1++;
            }
        }

        // Horizontal Histogram Display
        System.out.println("\nHorizontal Histogram");
        System.out.println("0-19    " + generateStars(ageGroup1));
        System.out.println("20-39   " + generateStars(ageGroup2));
        System.out.println("40-69   " + generateStars(ageGroup3));
        System.out.println("70-89   " + generateStars(ageGroup4));
        System.out.println("90-109  " + generateStars(ageGroup5));

        // Statistics Display
        System.out.println("Statistics");
        System.out.println("Total patients: " + (int)(ageGroup1 + ageGroup2 + ageGroup3 + ageGroup4 + ageGroup5));
        System.out.println("Patient age < 70: " + (int)(ageGroup1 + ageGroup2 + ageGroup3));
        System.out.println("Highest age: " + max);
        System.out.println("Lowest age: " + min);
        sc.close();

        // Vertical Histogram Display
        System.out.println("\nVertical Histogram");
        System.out.println("0-19 20-39 40-69 70-89 90-109");
        
    }


}