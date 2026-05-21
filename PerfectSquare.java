public class PerfectSquare {
    public static void main(String[] args) {
        int num = 49;
        boolean isPerfect = false;

        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                isPerfect = true;
                break;
            }
        }

        if (isPerfect) {
            System.out.println(num + " is a Perfect Square");
        } else {
            System.out.println(num + " is not a Perfect Square");
        }
    }
}
