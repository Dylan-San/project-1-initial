package Project1;

//Class Point
public class Point {
        //Declaration of double x and y
        private double x;
        private double y;

        //Constructor
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



    public static void main(String[] args) {

        //Creating an instance of the Point class
        Point point1 = new Point(3.0, 1.0);

        System.out.println("Project 1 : Point Tester");
        System.out.println();//Skips line
        System.out.println("Point 1: Point (x = " + point1.getX() + ", " + point1.getY() + ")");
        System.out.println();//Skips line
        point1.shiftX(3.0);
        point1.shiftY(4.0);
        System.out.println("Point 2: Point (x = " + point1.getX() + ", " + point1.getY() + ")");
        System.out.println();//Skips line

        Point p2 = new Point(point1.getX(), point1.getY());
        //Distance between p1 and p2

        double distance = point1.distance(p2);

        System.out.println("Distance between Point 1 and Point 2: " + distance);
        //System.out.println("Distance between Point 1 and Point 2: " + distance);
        // Shifting point1 along the x-axis
        System.out.println();//Skips line

    }
}
