public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int oldNo = num;
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

       
        if (rev == oldNo) {
            System.out.println(oldNo + " is a Palindrome Number");
        } else {
            System.out.println(oldNo + " is not a Palindrome Number");
        }
    }
}
