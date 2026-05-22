public class CountDigits {
    public static void main(String[] args) {
        int num = 45982;
        int originalNum = num;
        int count = 0;

        // Negative numbers ko handle karne ke liye Math.abs()
        int temp = Math.abs(num);

        // Agar number zero hai, toh usme 1 digit hoti hai
        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp = temp / 10; // Last digit hatao
                count++;          // Count badhao
            }
        }

        System.out.println("Number " + originalNum + " mein total " + count + " digits hain.");
    }
}
