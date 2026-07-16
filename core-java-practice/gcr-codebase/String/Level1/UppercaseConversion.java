import java.util.*;

public class UpperCaseConversion {

    static String up(String s) {
        String r = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z')
                c = (char)(c - 32);

            r += c;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String a = up(s);
        String b = s.toUpperCase();

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b));
    }
}