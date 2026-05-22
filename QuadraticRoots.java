public class QuadraticRoots {
    public static void main(String[] args) {
        // Equation: 1x^2 - 5x + 6 = 0 (Iske roots 3 aur 2 aane chahiye)
        double a = 1;
        double b = -5;
        double c = 6;

        // Step 1: Discriminant (D) nikalo -> b^2 - 4ac
        double d = (b * b) - (4 * a * c);

        System.out.println("Equation: " + a + "x^2 + (" + b + ")x + " + c + " = 0");

        // Step 2: If-else se teeno cases handle karo
        if (d > 0) {
            // Case 1: Real and Different Roots
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            
            System.out.printf("Roots are Real and Different:\n");
            System.out.printf("Root 1 = %.2f\n", r1);
            System.out.printf("Root 2 = %.2f\n", r2);
        } 
        else if (d == 0) {
            // Case 2: Real and Equal Roots
            double r1 = -b / (2 * a);
            
            System.out.printf("Roots are Real and Equal:\n");
            System.out.printf("Root 1 = Root 2 = %.2f\n", r1);
        } 
        else {
            // Case 3: Imaginary Roots (D < 0)
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            
            System.out.printf("Roots are Complex/Imaginary:\n");
            System.out.printf("Root 1 = %.2f + %.2fi\n", realPart, imaginaryPart);
            System.out.printf("Root 2 = %.2f - %.2fi\n", realPart, imaginaryPart);
        }
    }
}
