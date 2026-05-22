public class DecimalToOctal {
    public static void main(String[] args) {
        int decimal = 99; 
        int originalDecimal = decimal;
        
        String octal = "";

        if (decimal == 0) {
            octal = "0";
        } else {
            while (decimal > 0) {
                int remainder = decimal % 8; 
                octal = remainder + octal;   
                decimal = decimal / 8;       
            }
        }

        System.out.println("Decimal " + originalDecimal + " ka Octal form hai: " + octal);
    }
}
