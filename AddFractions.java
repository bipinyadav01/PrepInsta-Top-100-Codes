public class AddFractions {

    // HCF/GCD nikalne ke liye helper method (Euclid's Algorithm)
    public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        // Fraction 1: 1/3
        int n1 = 1, d1 = 3;
        // Fraction 2: 1/5
        int n2 = 1, d2 = 5;

        // Step 1 & 2: Cross multiplication se naya numerator aur denominator nikalo
        int n3 = (n1 * d2) + (n2 * d1);
        int d3 = d1 * d2;

        // Step 3: Dono ka GCD nikalo takki fraction ko simplify kiya ja sake
        int gcd = getGCD(n3, d3);

        // Final answer ko simplify karo
        int finalNumerator = n3 / gcd;
        int finalDenominator = d3 / gcd;

        System.out.println(n1 + "/" + d1 + " + " + n2 + "/" + d2 + " = " + finalNumerator + "/" + finalDenominator);
    }
}
