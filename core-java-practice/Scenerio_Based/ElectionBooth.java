import java.util.Scanner;

public class ElectionBooth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 0, c = 0;

        while (true) {
            System.out.print("Age (-1 to exit): ");
            int ag = sc.nextInt();

            if (ag == -1)
                break;

            if (ag >= 18) {
                System.out.print("Vote (1, 2, 3): ");
                int v = sc.nextInt();

                if (v == 1)
                    a++;
                else if (v == 2)
                    b++;
                else if (v == 3)
                    c++;
                else
                    System.out.println("Invalid vote!");
            } else {
                System.out.println("Not eligible!");
            }
        }

        System.out.println("\nResults:");
        System.out.println("Candidate 1: " + a);
        System.out.println("Candidate 2: " + b);
        System.out.println("Candidate 3: " + c);

        sc.close();
    }
}