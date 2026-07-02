// Recursion is a programming technique where a function calls itself to solve a smaller version of the same problem. Every recursive solution consists of a Base Case which stops the recursion and a Recursive Case that Calls the same function with a smaller or simpler input.

public class FinancialForecast {
    public static double futureValue(double currentValue, double growthRate, int years) {

        if (years == 0)
            return currentValue;
        return futureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {

        double presentValue = 10000;
        double growthRate = 0.08;
        int years = 5;

        double predictedValue = futureValue(presentValue, growthRate, years);

        System.out.printf(years, predictedValue);
    }
}

// The space complexity is O(n) because each recursive call occupies space on the call stack until the base case is reached.