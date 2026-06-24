import java.io.*;
import java.util.Scanner;

public class FeedbackAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.println("Enter 5 feedback messages:");

        for (int i = 1; i <= 5; i++) {

            String feedback = sc.nextLine();

            if (feedback.toLowerCase().contains("good")) {
                count++;
            }
        }

        System.out.println("Good Feedback Count = " + count);

        sc.close();
    }
}