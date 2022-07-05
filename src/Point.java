public class Point {
    private int x; // instance variables x & y
    private int y;

    public static int numberOfPoints = 0; // static method

    public Point() { // no args constructor
        x = 0;
        y = 0;
        numberOfPoints++; // add a counter under every constructor
    }

    public Point(int xVal, int yVal) { // overloaded constructor
        this.x = xVal;
        this.y = yVal;
        numberOfPoints++;
    }

    public int getX() { // getter method gets value  and returns the value, they have no parameter
        return this.x;
    }

    public int getY() {
        return this.y;
    }


    public void setX(int X) {  //setters store value in a variable
        this.x = X;

    }

    public void setY(int y) {
        this.y = y;

    }

    public void setPoint(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public String toString() { //toString method
        return "( " + this.x + ", " + this.y + ")";
    }

    public double distance(Point point) {
        double s1 = this.x - point.x;
        double s3 = this.y - point.y;
        return Math.sqrt(Math.pow(s1, 2) + Math.pow(s3, 2));
    }

    public boolean areTheyEqual(Point point) {
        if (this.x == point.getX() && this.y == point.getY()) {
            return true;
        } else {
            return false;
        }

    }

    public String blah() {
        return "Hello World \n" + "Hello World" + "\nHello World"; // example of creating a String toString method that returns 3 things


    }
}
