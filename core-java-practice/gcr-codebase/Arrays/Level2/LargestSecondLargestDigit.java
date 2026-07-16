import java.util.*;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        int[] digit = new int[10];
        int index = 0;

        while (num != 0 && index < 10) {
            digit[index++] = (int)(num % 10);
            num /= 10;
        }

        int largest = 0;
        int second = 0;

        for (int i = 0; i < index; i++) {
            if (digit[i] > largest) {
                second = largest;
                largest = digit[i];
            } else if (digit[i] > second && digit[i] != largest) {
                second = digit[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }
}
