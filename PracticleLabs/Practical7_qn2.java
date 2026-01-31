abstract class Shape {
    abstract String getDescription();
}

abstract class TwoDimensionalShape extends Shape {
    abstract double getArea();
}

abstract class ThreeDimensionalShape extends Shape {
    abstract double getArea();

    abstract double getVolume();
}

class Circle extends TwoDimensionalShape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    String getDescription() {
        return "Circle with radius " + radius;
    }
}

class Sphere extends ThreeDimensionalShape {
    double radius;

    Sphere(double r) {
        this.radius = r;
    }

    double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    double getVolume() {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }

    String getDescription() {
        return "Sphere with radius " + radius;
    }
}

public class Practical7_qn2 {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Sphere(3)
        };

        for (Shape s : shapes) {
            System.out.println(s.getDescription());
            if (s instanceof TwoDimensionalShape)
                System.out.println(((TwoDimensionalShape) s).getArea());
            else if (s instanceof ThreeDimensionalShape) {
                System.out.println(((ThreeDimensionalShape) s).getArea());
                System.out.println(((ThreeDimensionalShape) s).getVolume());
            }
            System.out.println();
        }
    }
}