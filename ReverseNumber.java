public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        int rev = 0;
        
        int temp = Math.abs(num);

        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        if (num < 0) {
            rev = -rev;
        }

        System.out.println("Reverse number is: " + rev);
    }
}
