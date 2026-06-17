import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        long temp = num;

        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digit = new int[count];

        temp = num;

        for (int i = 0; i < count; i++) {
            digit[i] = (int)(temp % 10);
            temp /= 10;
        }

        int[] freq = new int[10];

        for (int i = 0; i < count; i++) {
            freq[digit[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.println(i + " -> " + freq[i]);
        }
    }
}