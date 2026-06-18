import java.util.*;

public class WordsAndLengths {

    static int len(String s) {
        int c = 0;

        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (Exception e) {
        }

        return c;
    }

    static String[] sp(String s) {

        int c = 1;

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == ' ')
                c++;

        String[] a = new String[c];

        int st = 0, k = 0;

        for (int i = 0; i <= s.length(); i++) {

            if (i == s.length() || s.charAt(i) == ' ') {

                String w = "";

                for (int j = st; j < i; j++)
                    w += s.charAt(j);

                a[k++] = w;
                st = i + 1;
            }
        }

        return a;
    }

    static String[][] data(String[] a) {

        String[][] d = new String[a.length][2];

        for (int i = 0; i < a.length; i++) {
            d[i][0] = a[i];
            d[i][1] = String.valueOf(len(a[i]));
        }

        return d;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[][] d = data(sp(s));

        System.out.println("Word\tLength");

        for (int i = 0; i < d.length; i++)
            System.out.println(d[i][0] + "\t" + Integer.parseInt(d[i][1]));
    }
}