import java.util.*;

public class SplitTextCompare {

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

    static boolean cmp(String[] a, String[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] a = sp(s);
        String[] b = s.split(" ");

        System.out.println("Same : " + cmp(a, b));
    }
}