public class CoordinateQuadrant {
    public static void main(String[] args) {
        int x = 5;
        int y = -3;

        System.out.print("Coordinate (" + x + ", " + y + ") ");

       
        if (x == 0 && y == 0) {
            System.out.println("lies at the Origin.");
        } else if (x == 0) {
            System.out.println("lies on the Y-Axis.");
        } else if (y == 0) {
            System.out.println("lies on the X-Axis.");
        } 
       
        else if (x > 0 && y > 0) {
            System.out.println("lies in the 1st Quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("lies in the 2nd Quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("lies in the 3rd Quadrant.");
        } else {
            System.out.println("lies in the 4th Quadrant.");
        }
    }
}
