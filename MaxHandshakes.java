public class MaxHandshakes {
    public static void main(String[] args) {
        int n = 4; // Total number of people in the room

        // Formula: Total = (n * (n - 1)) / 2
        // long use kiya hai taaki agar party mein bohot log hon toh value overflow na ho
        long totalHandshakes = (long) n * (n - 1) / 2;

        System.out.println(n + " logon ke beech maximum " + totalHandshakes + " handshakes ho sakte hain.");
    }
}
