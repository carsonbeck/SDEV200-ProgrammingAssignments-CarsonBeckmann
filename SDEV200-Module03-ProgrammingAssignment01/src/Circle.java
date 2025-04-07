
public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + "and the radius is " + radius);
    }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Circle other = (Circle) obj;
        return Double.compare (other.radius, radius) == 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nradius: " + radius;
    }
}