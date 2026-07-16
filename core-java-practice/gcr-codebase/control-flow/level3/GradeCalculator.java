import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics Marks: ");
        double physics = sc.nextDouble();

        System.out.print("Enter Chemistry Marks: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter Maths Marks: ");
        double maths = sc.nextDouble();

        double average = (physics + chemistry + maths) / 3;

        String grade;
        String remarks;

        if (average >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (average >= 80) {
            grade = "A";
            remarks = "Very Good";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Good";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Average";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Pass";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        System.out.println("\nAverage Marks = " + average);
        System.out.println("Grade = " + grade);
        System.out.println("Remarks = " + remarks);

        sc.close();
    }
}
