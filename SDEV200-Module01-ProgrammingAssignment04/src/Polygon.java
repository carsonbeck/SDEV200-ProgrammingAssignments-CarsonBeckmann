public class Polygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public Polygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public Polygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public Polygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getX() {
        return x;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        Polygon polygon1 = new Polygon();
        Polygon polygon2 = new Polygon(6, 4);
        Polygon polygon3 = new Polygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1:");
        System.out.printf("Perimeter: %2f\n", polygon1.getPerimeter());
        System.out.printf("Area: %2f\n\n", polygon1.getArea());

        System.out.println("Polygon 2:");
        System.out.printf("Perimeter: %2f\n", polygon2.getPerimeter());
        System.out.printf("Area: %2f\n\n", polygon2.getArea());

        System.out.println("Polygon 3:");
        System.out.printf("Perimeter: %2f\n", polygon3.getPerimeter());
        System.out.printf("Area: %2f\n\n", polygon3.getArea());
    }
}
