public class StrongNumber {
    public static void main(String[] args) {
        int num = 145;
        int originalNum = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            
            // Fact find karne ka loop har digit ke liye
            int fact = 1;
            for (int i = digit; i >= 1; i--) {
                fact = fact * i;
            }
            
            sum = sum + fact;
            num = num / 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is a Strong Number");
        } else {
            System.out.println(originalNum + " is not a Strong Number");
        }
    }
}
