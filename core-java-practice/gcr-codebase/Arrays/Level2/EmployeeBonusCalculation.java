import java.util.*;

public class EmployeeBonusCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] sal = new double[10];
        double[] yrs = new double[10];
        double[] bonus = new double[10];
        double[] newSal = new double[10];

        double totalBonus = 0, oldTotal = 0, newTotal = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Salary: ");
            sal[i] = sc.nextDouble();

            System.out.print("Years: ");
            yrs[i] = sc.nextDouble();

            if (sal[i] <= 0 || yrs[i] < 0) {
                System.out.println("Invalid Input");
                i--;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (yrs[i] > 5)
                bonus[i] = sal[i] * 0.05;
            else
                bonus[i] = sal[i] * 0.02;

            newSal[i] = sal[i] + bonus[i];

            totalBonus += bonus[i];
            oldTotal += sal[i];
            newTotal += newSal[i];
        }

        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Old Salary Total = " + oldTotal);
        System.out.println("New Salary Total = " + newTotal);
    }
}