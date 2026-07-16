import java.util.*;

public class TrimSpacesUsingCharAt {

    static int[] trimPos(String s) {

        int st = 0;
        int en = s.length() - 1;

        while (st < s.length() && s.charAt(st) == ' ')
            st++;

        while (en >= 0 && s.charAt(en) == ' ')
            en--;

        return new int[] { st, en };
    }

    static String sub(String s, int a, int b) {

        String r = "";

        for (int i = a; i <= b; i++)
            r += s.charAt(i);

        return r;
    }

    static boolean cmp(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] p = trimPos(s);

        String a = sub(s, p[0], p[1]);
        String b = s.trim();

        System.out.println("User : " + a);
        System.out.println("Built-in : " + b);
        System.out.println("Same : " + cmp(a, b));
    }
}
