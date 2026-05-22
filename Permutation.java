public class Permutations {
    
   
    public static long getFactorial(int num) {
        long fact = 1;
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 3; // Total people (Log)
        int r = 2; // Total seats (Kursiyan)

       
        if (r > n) {
            System.out.println("Seats logon se zyada nahi ho sakti thin! Arrangement possible nahi hai.");
        } else {
            // Formula: nPr = n! / (n - r)!
            long numerator = getFactorial(n);         
            long denominator = getFactorial(n - r);   
            
            long totalPermutations = numerator / denominator;

            System.out.println(n + " logon ko " + r + " seats par baithane ke total " + totalPermutations + " tareeqe (Permutations) hain.");
        }
    }
}
