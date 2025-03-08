import java.util.Scanner;

class PowerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking base as input
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();

        // Taking exponent as input
        System.out.print("Enter the exponent: ");
        double exponent = sc.nextDouble();

        // Calculating power
        double result = Math.pow(base, exponent);

        // Displaying result
        System.out.println(base + "^" + exponent + " = " + result);

        sc.close(); // Closing the scanner
    }
}
