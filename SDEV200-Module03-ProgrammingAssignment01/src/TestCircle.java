public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0, "red", true);
        Circle circle2 = new Circle(5.0, "yellow", true);
        Circle circle3 = new Circle(7.5, "blue", false);

        System.out.println("Circle 1:");
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());

        System.out.println("\nComparing circle:");
        System.out.println("circle1 vs circle2: " + circle1.compareTo(circle2));
        System.out.println("circle1 vs circle3: " + circle1.compareTo(circle3));
        System.out.println("circle2 vs circle3: " + circle1.compareTo(circle3));

        System.out.println("\nEquality check:");
        System.out.println("circle1 equals circle2:" + circle1.equals(circle2));
        System.out.println("circle1 equals circle3: " + circle1.equals(circle3));
        System.out.println("circle2 equals circle3: " + circle2.equals(circle3));
    }
}