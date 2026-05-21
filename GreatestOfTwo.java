public class GreatestOfTwo {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 89;

        if (num1 > num2) {
            System.out.println(num1 + " is greatest");
        } else if (num2 > num1) {
            System.out.println(num2 + " is greatest");
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
