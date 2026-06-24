import java.io.*;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            FileWriter fw = new FileWriter(
                    "expenses.txt", true); // append mode

            System.out.print("Enter Expense Type: ");
            String type = sc.nextLine();

            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();

            fw.write(type + " - " + amount + "\n");

            fw.close();

            System.out.println("Expense saved successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}