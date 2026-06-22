import java.util.Scanner;

public class UserValidator {

    static boolean isValidUsername(String username, int index) {
        // Base case: all characters checked
        if (index == username.length()) {
            return true;
        }

        char ch = username.charAt(index);

        // Check if current character is a lowercase letter
        if (ch < 'a' || ch > 'z') {
            return false;
        }

        // Recursive call for the next character
        return isValidUsername(username, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        System.out.println(isValidUsername(username, 0));
    }
}