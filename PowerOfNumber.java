public class PowerOfNumber {
    public static void main(String[] args) {
        int num = 2;
        int pow = 3;
        int res = 1;

        for (int i = 0; i < pow; i++) {
            res = res * num;
        }

        System.out.println(num + " raised to the power of " + pow + " is: " + res);
    }
}
