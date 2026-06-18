import java.util.*;

public class RockPaperScissors {

    static String comp() {

        int n = (int) (Math.random() * 3);

        if (n == 0) return "Rock";
        if (n == 1) return "Paper";

        return "Scissors";
    }

    static String win(String u, String c) {

        if (u.equals(c))
            return "Draw";

        if ((u.equals("Rock") && c.equals("Scissors")) ||
            (u.equals("Paper") && c.equals("Rock")) ||
            (u.equals("Scissors") && c.equals("Paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int uw = 0, cw = 0;

        System.out.println("User\tComputer\tWinner");

        for (int i = 0; i < n; i++) {

            String u = sc.next();
            String c = comp();

            String w = win(u, c);

            if (w.equals("User")) uw++;
            if (w.equals("Computer")) cw++;

            System.out.println(u + "\t" + c + "\t\t" + w);
        }

        System.out.println("\nUser Wins : " + uw);
        System.out.println("Computer Wins : " + cw);

        System.out.printf("User %% : %.2f\n", (uw * 100.0) / n);
        System.out.printf("Computer %% : %.2f\n", (cw * 100.0) / n);
    }
}