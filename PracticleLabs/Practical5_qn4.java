class Rectangle {
    private double length = 1.0; // default value
    private double width = 1.0; // default value

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Invalid length. Must be > 0.0 and < 20.0");
        }
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Invalid width. Must be > 0.0 and < 20.0");
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Calculate perimeter
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Calculate area
    public double getArea() {
        return length * width;
    }
}

public class Practical5_qn4 {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle 1:");
        System.out.println("Length: " + rect1.getLength());
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Perimeter: " + rect1.getPerimeter());
        System.out.println("Area: " + rect1.getArea());

        //////////////////////////////////////////////////////////////////////
        Rectangle rect2 = new Rectangle(10.5, 5.5);
        System.out.println("Rectangle 2:");
        System.out.println("Length: " + rect2.getLength());
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Perimeter: " + rect2.getPerimeter());
        System.out.println("Area: " + rect2.getArea());


        rect2.setLength(25.0); // invalid
        rect2.setWidth(-3.0); // invalid
        System.out.println("Rectangle 2 after invalid updates:");
        System.out.println("Length: " + rect2.getLength());
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Perimeter: " + rect2.getPerimeter());
        System.out.println("Area: " + rect2.getArea());
    }

}