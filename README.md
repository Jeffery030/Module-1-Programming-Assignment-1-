
import java.util.Scanner;

public class MetersToFeetConverter{
    public static void main(String[] args) {
        
    /// create a scanner oberjctr to read input from user 
        Scanner scanner = new Scanner(System.in);

    // promet the user to enter a value in meters
     System.out.print("Enter the value in meters")
        double meters = scanner.nextDouble()

    // promet the user to enter a value in feet
     System.out.print("Enter the value in feet")
        double feet = scanner.nextDouble()

    // call user method of convert 
        convert(meters,foot);

    }
    public static void convert(double meters,double foot){
        // convert foot to meter
        double m = foot * 0.3048;

        // convert meter to foot
        double f = meter * 3.28084;


        // output results
        System.out.print("Value of " + meters + "meter in foot:" + f);
        System.out.print(("Value of " + foot + "foot in meter:" + m));




    }
