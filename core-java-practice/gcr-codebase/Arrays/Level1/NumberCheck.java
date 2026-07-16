import java.util.*;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++)
            num[i] = sc.nextInt();

        for (int n : num) {
            if (n > 0)
                System.out.println(n % 2 == 0 ? n + " Even" : n + " Odd");
            else if (n < 0)
                System.out.println(n + " Negative");
            else
                System.out.println("Zero");
        }

        if (num[0] == num[4])
            System.out.println("Equal");
        else if (num[0] > num[4])
            System.out.println("Greater");
        else
            System.out.println("Less");
    }
}