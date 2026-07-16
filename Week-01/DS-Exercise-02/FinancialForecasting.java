import java.util.Scanner;

public class FinancialForecasting {

    /*
     * Recursively calculates the future value.
     *
     * currentValue = present financial value
     * growthRate   = annual growth rate in decimal form
     * years        = number of years to forecast
     */
    public static double calculateFutureValue(
            double currentValue,
            double growthRate,
            int years
    ) {
        // Base case: no more years remain
        if (years == 0) {
            return currentValue;
        }

        // Calculate the value after one year
        double nextYearValue = currentValue * (1 + growthRate);

        // Recursively calculate the remaining years
        return calculateFutureValue(
                nextYearValue,
                growthRate,
                years - 1
        );
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current value: ");
        double currentValue = scanner.nextDouble();

        System.out.print("Enter the annual growth rate in percentage: ");
        double growthRatePercentage = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Convert percentage into decimal
        double growthRate = growthRatePercentage / 100;

        double futureValue = calculateFutureValue(
                currentValue,
                growthRate,
                years
        );

        System.out.printf(
                "Future value after %d years: %.2f%n",
                years,
                futureValue
        );

        scanner.close();
    }
}