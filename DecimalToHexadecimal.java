public class DecimalToHexadecimal {
    public static void main(String[] args) {
        int decimal = 30; // Test number
        int originalDecimal = decimal;
        
        String hex = "";
        
        
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        if (decimal == 0) {
            hex = "0";
        } else {
            while (decimal > 0) {
                int remainder = decimal % 16;  
                hex = hexChars[remainder] + hex; 
                decimal = decimal / 16;        
            }
        }

        System.out.println("Decimal " + originalDecimal + " ka Hexadecimal form hai: " + hex);
    }
}
