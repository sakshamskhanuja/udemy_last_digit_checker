public class Main {
    public static void main(String[] args) {
        // Checks if 41, 22, and 71 share the same last digit.
        System.out.println(hasSameLastDigit(41, 22, 71));

        // Checks if 23, 32, and 42 share the same last digit.
        System.out.println(hasSameLastDigit(23, 32, 42));

        // Checks if 9, 99, and 999 share the same last digit.
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    /**
     * Checks if three numbers share the same last digit.
     */
    public static boolean hasSameLastDigit(int a, int b, int c) {
        // Checks for invalid input.
        if (!(isValid(a) && isValid(b) && isValid(c))) {
            return false;
        }

        // Stores the last digit of var. a.
        int lastDigitA = a % 10;

        // Stores the last digit of var. b.
        int lastDigitB = b % 10;

        // Stores the last digit of var. c.
        int lastDigitC = c % 10;

        return ((lastDigitA == lastDigitB) || (lastDigitA == lastDigitC) || (lastDigitB == lastDigitC));
    }

    /**
     * Checks if number is between 10 and 1000.
     */
    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }
}