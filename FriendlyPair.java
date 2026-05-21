public class FriendlyPair {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 28;

        int sum1 = 0, sum2 = 0;

        // First number ke factors ka sum
        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0) sum1 += i;
        }

        // Second number ke factors ka sum
        for (int i = 1; i <= num2 / 2; i++) {
            if (num2 % i == 0) sum2 += i;
        }

      
        if ((sum1 * num2) == (sum2 * num1)) {
            System.out.println(num1 + " and " + num2 + " are a Friendly Pair");
        } else {
            System.out.println(num1 + " and " + num2 + " are not a Friendly Pair");
        }
    }
}
