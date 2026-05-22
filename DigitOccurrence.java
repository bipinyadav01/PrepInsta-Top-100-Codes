public class DigitOccurrence {
    public static void main(String[] args) {
        int num = 4598255; // Test number
        int targetDigit = 5; // Jis digit ko count karna hai
        
        int originalNum = num;
        int count = 0;

        // Negative numbers ko handle karne ke liye absolute value le lete hain
        int temp = Math.abs(num);

        // Edge case: Agar number hi 0 hai aur target bhi 0 hai
        if (temp == 0 && targetDigit == 0) {
            count = 1;
        } else {
            // Tumhara wala while loop logic
            while (temp > 0) {
                int lastDigit = temp % 10; // Aakhiri digit nikali
                
                if (lastDigit == targetDigit) {
                    count++; // Agar match hui toh count badhaya
                }
                
                temp = temp / 10; // Aakhiri digit ko hata diya
            }
        }

        System.out.println("Number " + originalNum + " mein digit " + targetDigit + " kul " + count + " baar aaya hai.");
    }
}
