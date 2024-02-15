public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    /**
     * Constructs a RewardValue object with a cash value.
     *
     * @param cashValue the cash value
     */
    public RewardValue(double cashValue) {
        this.cashValue = Math.max(cashValue, 0); // Ensure non-negative cash value
    }

    /**
     * Constructs a RewardValue object with a miles value.
     *
     * @param milesValue the miles value
     */
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(Math.max(milesValue, 0)); // Ensure non-negative miles value
    }

    /**
     * Converts cash value to equivalent miles.
     *
     * @param cashValue the cash value to convert
     * @return the equivalent miles
     */
    private static int convertToMiles(double cashValue) {
        return (int) Math.round(cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    /**
     * Converts miles to equivalent cash value.
     *
     * @param milesValue the miles to convert
     * @return the equivalent cash value
     */
    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    /**
     * Returns the cash value of this RewardValue.
     *
     * @return the cash value
     */
    public double getCashValue() {
        return cashValue;
    }

    /**
     * Returns the miles value of this RewardValue.
     *
     * @return the miles value
     */
    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }

    /**
     * Returns a string representation of this RewardValue.
     *
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return String.format("RewardValue{cashValue=%.2f, milesValue=%d}", getCashValue(), getMilesValue());
    }
}
