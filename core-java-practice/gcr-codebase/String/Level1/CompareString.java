import java.util.*;

public class CompareStrings {

    static boolean cmp(String a, String b) {
        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();

        System.out.println("charAt : " + cmp(a, b));
        System.out.println("equals : " + a.equals(b));
    }
}