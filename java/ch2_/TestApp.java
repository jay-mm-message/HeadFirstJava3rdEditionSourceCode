package ch2_;

public class TestApp {
    public static void main(String[] args) {
        
        Shape [] shapes = {new Square(), new Circle(), new Triangle(), new Amoeba()};

        for (Shape shape : shapes) {
            shape.rotate();
        }
    }
}
