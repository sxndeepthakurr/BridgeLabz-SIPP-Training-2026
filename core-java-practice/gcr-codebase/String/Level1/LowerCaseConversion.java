import java.util.*;

public class LowerCaseConversion {

    static String low(String s) {
        String r = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z')
                c = (char) (c + 32);

            r += c;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String a = low(s);
        String b = s.toLowerCase();

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b));
    }
}
