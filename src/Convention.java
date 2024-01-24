import java.util.Scanner;

public class Convention {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter input
        System.out.print("Enter the unit you want to convert from (Feet/Pounds/Fahrenheit): ");
        String fromUnit = scanner.nextLine().toLowerCase();
        System.out.print("Enter the unit you want to convert to (Meters/Kgs/Celsius): ");
        String toUnit = scanner.nextLine().toLowerCase();
        System.out.print("Enter the quantity to be converted: ");
        double quantity = scanner.nextDouble();

        double ans = convert(fromUnit, toUnit, quantity);

        // Display the answer
        System.out.println("Answer : " + ans);
    }

    private static double convert(String fromUnit, String toUnit, double quantity) {
        switch (fromUnit) {
            case "feet":
                if (toUnit.equals("meters")) {
                    return feetToMeters(quantity);
                }
                System.out.println("Conversion not supported");
                return 0.0;
            case "pounds":
                if (toUnit.equals("kgs")) {
                    return poundsToKgs(quantity);
                }
                System.out.println("Conversion not supported");
                return 0.0;
            case "fahrenheit":
                if (toUnit.equals("celsius")) {
                    return fahrenheitToCelsius(quantity);
                }
                System.out.println("Conversion not supported");
                return 0.0;
            default:
                System.out.println("Conversion not supported");
                return 0.0;
        }
    }

    private static double feetToMeters(double feet) {
        // Conversion formula: 1 foot = 0.3048 meters
        return feet * 0.3048;
    }

    private static double poundsToKgs(double pounds) {
        // Conversion formula: 1 pound = 0.453592 kgs
        return pounds * 0.453592;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        // Conversion formula: (F - 32) * 5/9
        return (fahrenheit - 32) * 5 / 9;
    }
}

