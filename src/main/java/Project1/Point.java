package Project1;

//Class Point
public class Point {
    //Declaration of double x and y
    public double x;
    public double y;
    //Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //X standard setter
    public void setX(double x) {
        this.x = x;
    }
    //Y standard setter
    public void setY(double y) {
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
    //Set Point
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
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

    public static void main(String[] args) {

        Point point1 = new Point(3.0, 1.0);
        Point point2 = new Point(6.0, 5.0);

        System.out.println("Project 1 : Point Tester");
        System.out.println();//Skips line
        System.out.println("Point 1: Point (x = " + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2: Point (x = " + point2.getX() + ", " + point2.getY() + ")");

        //Distance between p1 and p2
        double distance = point1.distance(point2);
        System.out.println("Distance between Point 1 and Point 2: " + distance);
        // Shifting point1 along the x-axis
        point1.shiftX(2.0);

        // Shifting point2 along the y-axis
        point2.shiftY(3.0);

        // Displaying updated coordinates
        System.out.println("Updated Point 1 Coordinates: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Updated Point 2 Coordinates: (" + point2.getX() + ", " + point2.getY() + ")");
    }
}
