package ch8__;

public class Test {
    public static void main(String [] args) {
        
        Animal [] animals = {new Dog(3), new Tiger(12)};

        for (Animal animal : animals) {
            animal.bark();
        }
    }
}
