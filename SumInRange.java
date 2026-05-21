public class SumInRange {
    public static void main(String[] args) {
        int start = 10;
        int end = 20;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("Sum of numbers from " + start + " to " + end + " is: " + sum);
    }
}
