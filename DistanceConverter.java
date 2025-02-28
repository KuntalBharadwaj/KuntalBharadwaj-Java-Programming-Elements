import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3;  // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760;  // 1 mile = 1760 yards

        System.out.println("The distance is " + distanceInYards + " yards and " + distanceInMiles + " miles.");
    }
}
