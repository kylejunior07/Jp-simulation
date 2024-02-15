public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = Math.max(0, cashValue); // Ensure non-negative values
    }

    // Constructor for miles value, using static method for conversion
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(Math.max(0, milesValue)); // Ensure non-negative values
    }

    // Convert cash to miles, rounding off to the nearest integer
    public static int convertToMiles(double cashValue) {
        return (int) Math.round(cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    // Convert miles to cash
    public static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Get miles value, using instance cash value
    public int getMilesValue() {
        return convertToMiles(cashValue);
    }
}
