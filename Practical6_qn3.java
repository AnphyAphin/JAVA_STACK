// Polygon.java
class Polygon {
    protected int height;
    protected int width;

    // Method to set values
    public void setValues(int height, int width) {
        this.height = height;
        this.width = width;
    }
}

// Rectangle.java
class Rectangle extends Polygon {

    // Method to calculate area
    public int area() {
        return height * width;
    }
}

// myMain.java
public class Practical6_qn3 {

    public static void main(String[] args) {
        // Create Rectangle object
        Rectangle rect = new Rectangle();

        // Set values using inherited method
        rect.setValues(10, 20);

        // Display area
        System.out.println("Height: " + rect.height);
        System.out.println("Width: " + rect.width);
        System.out.println("Area of Rectangle: " + rect.area());
    }
}
