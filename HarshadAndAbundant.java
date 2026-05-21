public class HarshadAndAbundant {
    public static void main(String[] args) {
        // --- HARSHAD NUMBER CHECK ---
        int num1 = 24;
        int temp1 = num1;
        int sumDigits = 0;

        while (temp1 != 0) {
            int digit = temp1 % 10;
            sumDigits += digit;
            temp1 /= 10;
        }

        if (num1 % sumDigits == 0) {
            System.out.println(num1 + " is a Harshad Number");
        } else {
            System.out.println(num1 + " is not a Harshad Number");
        }

        // --- ABUNDANT NUMBER CHECK ---
        int num2 = 12;
        int sumFactors = 0;

        for (int i = 1; i <= num2 / 2; i++) {
            if (num2 % i == 0) {
                sumFactors += i;
            }
        }

        if (sumFactors > num2) {
            System.out.println(num2 + " is an Abundant Number");
        } else {
            System.out.println(num2 + " is not an Abundant Number");
        }
    }
}
