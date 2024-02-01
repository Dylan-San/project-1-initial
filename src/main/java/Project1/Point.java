package Project1;

//Class Point
public class Point {
        //Declaration of double x and y
        private double x;
        private double y;
        // Variables to store original coordinates
        private double originalX;
        private double originalY;
        // Constructor
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
    }

        //X standard setter
        public void setX(double x2) {
            this.x = x2;
    }
        //Y standard setter
        public void setY(double y2) {
            this.y = y2;
    }
    //Set Point
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //X standard getter
    public double getX() {
        return x;
    }
    //Y standard getter
    public double getY() {
        return y;
    }

    //Shift X
    public void shiftX(double n) {
        this.x += n;
    }
    //Shift Y
    public void shiftY(double n) {
        this.y += n;
    }
    //Distance
    public double distance(Point p2) {
        double deltaX = p2.getX() - this.x;
        double deltaY = p2.getY() - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    //Rotate
    public void rotate(double angle) {
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        x = newX;
        y = newY;
    }
    // Save the original coordinates
    public void saveOriginalCoordinates() {
        originalX = x;
        originalY = y;
    }

    // Restore the original coordinates
    public void restoreOriginalCoordinates() {
        x = originalX;
        y = originalY;
    }

    public static void main(String[] args) {

        //Creating an instance of the Point class
        Point p1 = new Point(3.0, 1.0);
        // Save the original coordinates of p1
        p1.saveOriginalCoordinates();

        System.out.println("Project 1 : Point Tester");
        System.out.println();//Skips line
        System.out.println("Point 1: Point (x = " + p1.getX() + ", " + p1.getY() + ")");
        System.out.println();//Skips line
        p1.shiftX(3.0);
        p1.shiftY(4.0);
        System.out.println("Point 2: Point (x = " + p1.getX() + ", " + p1.getY() + ")");
        System.out.println();//Skips line

        //Point 2
        Point p2 = new Point(p1.getX(), p1.getY());
        // Restore the original coordinates of p1
        p1.restoreOriginalCoordinates();
        //Distance between p1 and p2

        System.out.println("Distance between Point 1 and Point 2: " + p1.distance(p2));
        //System.out.println("Distance between Point 1 and Point 2: " + distance);
        // Shifting point1 along the x-axis
        System.out.println();//Skips line
        // Rotate the point by a specified angle (in radians)
        double rotationAngle = Math.PI / 2.0; // Rotate by 45 degrees (pi/4 radians)
        p2.rotate(rotationAngle);

        // Display coordinates after rotation
        System.out.println("Rotated by PI/2");
        System.out.println();//Skips line
        System.out.println("Point Coordinates after Rotation: (" + p2.getX() + ", " + p2.getY() + ")");

    }
}
