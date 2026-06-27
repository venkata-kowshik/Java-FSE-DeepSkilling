public class FinancialForecasting {

    // Recursive method
    static double future(double amount, double rate, int years) {

        // Base case
        if (years == 0)
            return amount;

        // Recursive call
        return future(amount * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {

        double result = future(1000, 0.1, 5);

        System.out.println("Future Value = " + result);
    }
}