import java.util.*;

public class StringLengthWithoutLength {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println("User Length : " + len(s));
        System.out.println("Built-in Length : " + s.length());
    }
}