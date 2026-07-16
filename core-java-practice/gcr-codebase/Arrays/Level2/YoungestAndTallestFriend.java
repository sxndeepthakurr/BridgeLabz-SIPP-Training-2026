import java.util.*;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] ht = new double[3];

        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            ht[i] = sc.nextDouble();
        }

        int young = 0;
        int tall = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[young])
                young = i;

            if (ht[i] > ht[tall])
                tall = i;
        }

        System.out.println("Youngest: " + name[young]);
        System.out.println("Tallest: " + name[tall]);
    }
}
