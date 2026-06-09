import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter distance in feet: ");
        double distInFeet = sc.nextDouble();

        
        double distInYards = distInFeet / 3;

        
        double distInMiles = distInYards / 1760;

        
        System.out.println("The distance in yards is " + distInYards +
                           " while the distance in miles is " + distInMiles);

        sc.close();
    }
}
