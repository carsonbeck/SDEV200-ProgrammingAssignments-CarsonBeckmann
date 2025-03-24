
public class CreditCardValidation {

    /**
     * Return true if the card number is valid
     */
    public static boolean isValid(long number) {
        int totalSum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return (totalSum % 10 == 0) && (getSize(number) >= 13 && getSize(number) <= 16) &&
                (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                        prefixMatched(number, 37) || prefixMatched(number, 6));
    }

    /**
     * Get the result from Step 2
     */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String numStr = Long.toString(number);
        for (int i = numStr.length() - 2; i >= 0; i -= 2){
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += getDigit(digit * 2);
        }
        return sum;
    }

    /**
     * Return this number if it is a single digit, otherwise,
     * return the sum of the two digits
     */
    public static int getDigit(int number){
        if (number < 10) {
            return number;
        } else {
            return (number / 10) + (number % 10);
        }
    }

    /**
     * Return sum of odd-place digits in number
     */
    public static int sumOfOddPlace(long number){
        int sum = 0;
        String numStr = Long.toString(number);
        for (int i = numStr.length() - 1; i >= 0; i -=2) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += digit;
        }
        return sum;
    }

    /**
     * Return true if the number d is a prefix for number
     */
    public static boolean prefixMatched(long number, int d){
        return getPrefix(number, getSize(d)) == d;
    }

    /**
     * Return the number of digits in d
     */
    public static int getSize(long d){
        return Long.toString(d).length();
    }

    /**
     * Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number.
     */
    public static long getPrefix(long number, int k){
        String numStr = Long.toString(number);
        if (numStr.length() < k) {
            return number;
        } else {
            return Long.parseLong(numStr.substring(0, k));
        }
    }

    public static void main(String[] args) {
        long cardNumber = 4388576018402626L;
        System.out.println("Is the credit card number valid? " + isValid(cardNumber));
    }
}