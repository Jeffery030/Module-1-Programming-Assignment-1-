import java.util.Scanner;

public class MetersToFeetConverter {
    public static void main(String[] args) {
        // Create a scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a value in meters
        System.out.print("Enter the value in meters: ");
        double meters = scanner.nextDouble();

        // Prompt the user to enter a value in feet
        System.out.print("Enter the value in feet: ");
        double feet = scanner.nextDouble();

        // Call user-defined method to convert values
        convert(meters, feet);

        // Close scanner to prevent resource leak
        scanner.close();
    }

    public static void convert(double meters, double feet) {
        // Convert feet to meters
        double metersFromFeet = feet * 0.3048;

        // Convert meters to feet
        double feetFromMeters = meters * 3.28084;

        // Output results
        System.out.println("Value of " + meters + " meters in feet: " + feetFromMeters);
        System.out.println("Value of " + feet + " feet in meters: " + metersFromFeet);
    }
}

