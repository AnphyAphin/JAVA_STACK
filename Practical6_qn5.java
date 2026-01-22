class Polygon {
    protected int height;
    protected int width;

    public void setValues(int height, int width) {
        this.height = height;
        this.width = width;
    }
}

class Rectangle extends Polygon {

    public int areaR() {
        return height * width;
    }
}

class Triangle extends Polygon {

    public double areaT() {
        return 0.5 * height * width;
    }
}

public class Practical6_qn5 {

    public static void main(String[] args) {

        Rectangle rect = new Rectangle();
        rect.setValues(10, 20);
        System.out.println("Rectangle Height: " + rect.height);
        System.out.println("Rectangle Width: " + rect.width);
        System.out.println("Area of Rectangle: " + rect.areaR());

        Triangle tri = new Triangle();
        tri.setValues(10, 20);
        System.out.println("Triangle Height: " + tri.height);
        System.out.println("Triangle Base (Width): " + tri.width);
        System.out.println("Area of Triangle: " + tri.areaT());
    }
}