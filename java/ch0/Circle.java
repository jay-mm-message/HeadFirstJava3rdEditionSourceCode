package ch0;

public class Circle {
    // ?���b?
    private double radius;

    // �۳y��?
    public Circle(double radius) {
        this.radius = radius;
    }

    // ?��?����?
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // ?�ؤ@? Circle ?�H
        Circle circle = new Circle(5.0);
        
        // ?��}���L?����?
        double area = circle.calculateArea();
        System.out.println("?����?�O: " + area);
    }
}
