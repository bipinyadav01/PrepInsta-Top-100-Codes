public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28;
        int sum = 0;

        // Notes logic: divisors ka sum (n/2 tak)
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (num == sum) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is not a Perfect Number");
        }
    }
}
