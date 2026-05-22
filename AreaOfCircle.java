public class AreaOfCircle {
    public static void main(String[] args) {
        double radius = 5.0; // Circle ka radius

        // Formula: Area = pi * r * r
        double area = Math.PI * radius * radius;

        // %.2f se point ke baad sirf 2 digits tak answer print hoga
        System.out.printf("Radius " + radius + " waale circle ka area hai: %.2f\n", area);
    }
}
