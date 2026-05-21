public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 4; 
        int a = 0;
        int b = 1;

        if (num >= 1) System.out.print(a + " ");
        if (num >= 2) System.out.print(b + " ");

        for (int i = 2; i < num; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
