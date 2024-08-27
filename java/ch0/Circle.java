package ch0;

public class Circle {
    // ?的半?
    private double radius;

    // 构造函?
    public Circle(double radius) {
        this.radius = radius;
    }

    // ?算?的面?
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // ?建一? Circle ?象
        Circle circle = new Circle(5.0);
        
        // ?算并打印?的面?
        double area = circle.calculateArea();
        System.out.println("?的面?是: " + area);
    }
}
