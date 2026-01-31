abstract class Polygon {
    protected int height;
    protected int width;

    public void setValues(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public abstract double area();
}

class Rectangle extends Polygon {

    @Override
    public double area() {
        return height * width;
    }
}

class Triangle extends Polygon {

    @Override
    public double area() {
        return 0.5 * height * width;
    }
}

public class Practical6_qn6 {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setValues(10, 20);
        System.out.println("Rectangle Height: " + rect.height);
        System.out.println("Rectangle Width: " + rect.width);
        System.out.println("Rectangle Area: " + rect.area());

        /////////////////////////////////////////////////////////////////////////////////
        // Triangle object
        Triangle tri = new Triangle();
        tri.setValues(10, 20);
        System.out.println("Triangle Height: " + tri.height);
        System.out.println("Triangle Base (Width): " + tri.width);
        System.out.println("Triangle Area: " + tri.area());
    }
}