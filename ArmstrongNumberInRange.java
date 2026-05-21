public class ArmstrongNumberInRange {
    public static void main(String[] args) {
        int initial = 100;
        int pfFinal = 999;

        System.out.println(initial + " se " + pfFinal + " Armstrong numbers:");

        for (int i = initial; i <= pfFinal; i++) {
            int temp = i;
            int sum = 0;
            
            
            int digits = String.valueOf(i).length();

            while (temp != 0) {
                int digit = temp % 10;
                sum = sum + (int) Math.pow(digit, digits);
                temp = temp / 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
