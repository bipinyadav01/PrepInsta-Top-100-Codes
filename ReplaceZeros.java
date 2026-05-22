public class ReplaceZeros {
    public static void main(String[] args) {
        int num = 102030;
        
        // Step 1: Number ko String mein convert kiya
        String str = String.valueOf(num);
        String res = ""; // Nayi khali string

        // Step 2: Loop chalaya i=0 se length tak
        for (int i = 0; i < str.length(); i++) {
            // character check karne ke liye singe quotes '' use hote hain
            if (str.charAt(i) == '0') { 
                res = res + '1'; // Agar 0 mila toh 1 add kiya
            } else {
                res = res + str.charAt(i); // Varna normal character add kiya
            }
        }

        // Step 3: String ko wapas Integer mein convert kar liya
        int finalNum = Integer.parseInt(res);

        System.out.println("Original Number: " + num);
        System.out.println("Modified Number: " + finalNum);
    }
}
