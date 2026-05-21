public class AutomorphicNumber {
    public static void main(String[] args) {
        int num = 25;
        int square = num * num;

        int digitsCount = String.valueOf(num).length();
        int divisor = (int) Math.pow(10, digitsCount);

        if (square % divisor == num) {
            System.out.println(num + " is an Automorphic Number");
        } else {
            System.out.println(num + " is not an Automorphic Number");
        }
    }
}
