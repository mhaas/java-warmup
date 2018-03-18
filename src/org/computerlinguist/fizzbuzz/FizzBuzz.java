package org.computerlinguist.fizzbuzz;

public class FizzBuzz {


    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";
    private static final int DIVISOR_FIZZ = 3;
    private static final int DIVISOR_BUZZ = 5;

    /**
     * Implementation of the popular fizzbuzz algorithm.
     *
     * @param number Integer to be transformed
     * @return Transformed Integer as String
     */
    public static String fizzBuzz(int number) {
        if (number != 0) {
            StringBuffer resultBuffer = new StringBuffer();
            if (number % DIVISOR_FIZZ == 0) {
                resultBuffer.append(FIZZ);
            }
            if (number % DIVISOR_BUZZ == 0) {
                resultBuffer.append(BUZZ);
            }
            if (resultBuffer.length() > 0) {
                return resultBuffer.toString();
            }
        }
        return Integer.toString(number);
    }
}
