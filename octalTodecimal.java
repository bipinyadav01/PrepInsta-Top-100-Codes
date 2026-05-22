public class OctalToDecimal {
    public static void main(String[] args) {
        int octal = 143; // Test Octal Number
        int originalOctal = octal;
        
        int decimal = 0;
        int power = 0;

        while (octal > 0) {
            
            int digit = octal % 10;

            
            decimal = decimal + (int)(digit * Math.pow(8, power));

            power++;
            octal = octal / 10;
        }

        System.out.println("Octal " + originalOctal + " ka Decimal form hai: " + decimal);
    }
}
