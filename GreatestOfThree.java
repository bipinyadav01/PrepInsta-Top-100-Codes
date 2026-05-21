public class GreatestOfThree {
    public static void main(String[] args) {
        int a = 35, b = 85, c = 55;

        if (a >= b && a >= c) {
            System.out.println(a + " is the greatest number");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the greatest number");
        } else {
            System.out.println(c + " is the greatest number");
        }
    }
}
